

/**
 * 页面渲染结束后自动执行的类
 */
$(document).ready(function() {
    $.appUtils.init();
});


/**
 * 所有其他类型的方法
 * @type {{init: $.appUtils.init, queryList: $.appUtils.queryList}}
 */
$.appUtils={
		init:function(){
            $.appUtils.queryList();
            $.appUtils.initValid();
		},
		queryList:function(){

            $('#appTable').bootstrapTable('refreshOptions',{
                url: getContextPath() + "/app/selectByExample",
                queryParams:function(params){
                    return{
                        offset: params.offset,
                        pageSize: params.limit
                        //对象查询相关可以从此处传递值,具体实现需自行编码
                        //例如: id:id

                    }
                },
                responseHandler: function (response) {
                    return response;
                }
            });
        },
        initValid:function(){

            $('#addAppForm').validate({
                rules:{


                            name : "required",

                            description : "required",

                            createTime : "required",

                            updateTime : "required",

                            emails : "required",

                },
                messages:{
                        name : "请输入APP名(一般是产品线+服务名)!",
                        description : "请输入介绍!",
                        createTime : "请输入生成时间!",
                        updateTime : "请输入修改时!",
                        emails : "请输入邮箱列表逗号分隔!",

                },
                errorClass: "text-danger",
                errorElement: "span",
                highlight:function(element, errorClass, validClass) {
                $(element).parent().addClass('has-error');
                },
                unhighlight: function(element, errorClass, validClass) {
                $(element).parent().removeClass('has-error');
                }

            });



            $('#updateAppForm').validate({
            rules:{

                    name : "required",

                    description : "required",

                    createTime : "required",

                    updateTime : "required",

                    emails : "required",

            },
            messages:{
                    name : "请输入APP名(一般是产品线+服务名)!",
                    description : "请输入介绍!",
                    createTime : "请输入生成时间!",
                    updateTime : "请输入修改时!",
                    emails : "请输入邮箱列表逗号分隔!",

            },
            errorClass: "text-danger",
            errorElement: "span",
            highlight:function(element, errorClass, validClass) {
            $(element).parent().addClass('has-error');
            },
            unhighlight: function(element, errorClass, validClass) {
            $(element).parent().removeClass('has-error');
            }

            });




        }
};

/**
 * 所有非后台交互的按钮产生的动作方法
 * @type {{deleteById: $.appUtils.button.deleteById, updateById: $.appUtils.button.updateById, deleteBatch: $.appUtils.button.deleteBatch}}
 */
$.appUtils.button={
    add:function(){

        $('#addAppForm div').removeClass('has-error');

        $('#addAppForm').validate().resetForm();

        $('#addAppForm')[0].reset();

        $('#addAppDialog').modal('show');
    },
    deleteByPrimaryKey:function(
            appId
    ){

        $("#appIdForDel").val(appId);

        $('#deleteAppDialog').modal('show');

    },
    updateById:function(
            appId
    ){
        $.ajax({
            url: getContextPath() + "/app/selectByPrimaryKey",
            data: {
                        appId:appId
                    },
            success: function (response) {
                //if (response.code != '000') {
                    //如果返回Json中存在标识码等,可以通过下面的方法显示错误信息,
                //    $.utils.alertError(response.message);
              //  } else {
                    var data= $.utils.objToJson(response);

                    $('#updateAppForm div').removeClass('has-error');

                    $('#updateAppForm').validate().resetForm();

                    $('#updateAppForm')[0].reset();

                    $('#updateAppForm').fill(JSON.parse(data));

                    $('#updateAppDialog').modal('show');
                //}
            }
        });
    },
    operationBatch:function () {
        //获取选中的所有数据
        var list = $('#appTable').bootstrapTable('getAllSelections');

        if(list == null || list.length == 0){
            $.utils.alertWarning("请选择至少一个数据!");
            return;
        }

        $("#batchAppDialog").modal("show");

    },
    selectByPrimaryKey:function(
            appId
    ){
        $.ajax({
            url: getContextPath() + "/app/selectByPrimaryKey",
            data: {
                        appId:appId
                    },
            success: function (response) {
                    var data= $.utils.objToJson(response);

                    $('#showAppForm')[0].reset();

                    $('#showAppForm').fill(JSON.parse(data));

                    $('#showAppDialog').modal('show');

            }
        });
    }

};

/**
 * 所有直接通过操作与后台进行交互的方法
 * @type {{addApp: $.appUtils.submit.addApp, updateABC: $.appUtils.submit.updateApp, deleteById: $.appUtils.submit.deleteById, search: $.appUtils.submit.search, batch: $.appUtils.submit.batch}}
 */
$.appUtils.submit={
    addApp:function(){
        if($('#addAppForm').valid()){
            $.utils.submit('/app/insert', '#addAppForm', '#addAppDialog', '新增出错~', null, '#appTable', null, '新增成功~');
        }
    },
    updateApp:function(){
        if($('#updateAppForm').valid()){
            $.utils.submit('/app/updateByPrimaryKeySelective', '#updateAppForm', '#updateAppDialog', '修改出错~', null, '#appTable', null, '修改成功~');
        }
    },
    deleteByPrimaryKey:function() {
        $.utils.submit('/app/deleteByPrimaryKey', '#deleteAppForm', '#deleteAppDialog', '修改出错~', null, '#appTable', null, '修改成功~');
    },
    search:function(){

        $("#appTable").bootstrapTable('removeAll');

        //重新传递查询条件,也可以修改URL
        $("#appTable").bootstrapTable('refreshOptions',{
            url:getContextPath() + "/app/selectByPrimaryKey",
            queryParams:function(params){
                return $("#searchForm").serialize();

            },
            responseHandler: function (response) {

                return {
                    rows:new Array(response),
                    totalRecord:1
                }
            }
        });

    },
    batch:function () {
        //获取全部选择的数据
        var list = $('#appTable').bootstrapTable('getAllSelections');
        //进行Ajax交互处理数据
    }

};

/**
 * 所有额外处理格式化的方法
 * @type {{operation: $.appUtils.formatter.operation}}
 */
$.appUtils.formatter={
    operation:function (value, row) {
        var html =  "<div class='btn-toolbar' role='toolbar'>" +
                    "<button type='button' class='btn btn-info' onclick='$.appUtils.button.selectByPrimaryKey("
                            + row.appId
                    +
                    ")'>查看</button>"+
                    "<button type='button' class='btn btn-primary' onclick='$.appUtils.button.updateById("
                            +   row.appId
                    +
                    ")'>修改</button>"+
                    "<button type='button' class='btn btn-danger' onclick='$.appUtils.button.deleteByPrimaryKey("
                            +   row.appId
                    +
                    ")'>删除</button>"+
                    "</div>";
        return  html;
    }
};


