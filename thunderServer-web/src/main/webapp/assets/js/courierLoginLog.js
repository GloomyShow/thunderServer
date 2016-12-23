

/**
 * 页面渲染结束后自动执行的类
 */
$(document).ready(function() {
    $.courierLoginLogUtils.init();
});


/**
 * 所有其他类型的方法
 * @type {{init: $.courierLoginLogUtils.init, queryList: $.courierLoginLogUtils.queryList}}
 */
$.courierLoginLogUtils={
		init:function(){
            $.courierLoginLogUtils.queryList();
            $.courierLoginLogUtils.initValid();
		},
		queryList:function(){

            $('#courierLoginLogTable').bootstrapTable('refreshOptions',{
                url: getContextPath() + "/courierLoginLog/selectByExample",
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

            $('#addCourierLoginLogForm').validate({
                rules:{


                            customerId : "required",

                            loginTime : "required",



                },
                messages:{
                        customerId : "请输入!",
                        loginTime : "请输入!",

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



            $('#updateCourierLoginLogForm').validate({
            rules:{

                    customerId : "required",

                    loginTime : "required",



            },
            messages:{
                    customerId : "请输入!",
                    loginTime : "请输入!",

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
 * @type {{deleteById: $.courierLoginLogUtils.button.deleteById, updateById: $.courierLoginLogUtils.button.updateById, deleteBatch: $.courierLoginLogUtils.button.deleteBatch}}
 */
$.courierLoginLogUtils.button={
    add:function(){

        $('#addCourierLoginLogForm div').removeClass('has-error');

        $('#addCourierLoginLogForm').validate().resetForm();

        $('#addCourierLoginLogForm')[0].reset();

        $('#addCourierLoginLogDialog').modal('show');
    },
    deleteByPrimaryKey:function(
            id
    ){

        $("#idForDel").val(id);

        $('#deleteCourierLoginLogDialog').modal('show');

    },
    updateById:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/courierLoginLog/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                //if (response.code != '000') {
                    //如果返回Json中存在标识码等,可以通过下面的方法显示错误信息,
                //    $.utils.alertError(response.message);
              //  } else {
                    var data= $.utils.objToJson(response);

                    $('#updateCourierLoginLogForm div').removeClass('has-error');

                    $('#updateCourierLoginLogForm').validate().resetForm();

                    $('#updateCourierLoginLogForm')[0].reset();

                    $('#updateCourierLoginLogForm').fill(JSON.parse(data));

                    $('#updateCourierLoginLogDialog').modal('show');
                //}
            }
        });
    },
    operationBatch:function () {
        //获取选中的所有数据
        var list = $('#courierLoginLogTable').bootstrapTable('getAllSelections');

        if(list == null || list.length == 0){
            $.utils.alertWarning("请选择至少一个数据!");
            return;
        }

        $("#batchCourierLoginLogDialog").modal("show");

    },
    selectByPrimaryKey:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/courierLoginLog/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                    var data= $.utils.objToJson(response);

                    $('#showCourierLoginLogForm')[0].reset();

                    $('#showCourierLoginLogForm').fill(JSON.parse(data));

                    $('#showCourierLoginLogDialog').modal('show');

            }
        });
    }

};

/**
 * 所有直接通过操作与后台进行交互的方法
 * @type {{addCourierLoginLog: $.courierLoginLogUtils.submit.addCourierLoginLog, updateABC: $.courierLoginLogUtils.submit.updateCourierLoginLog, deleteById: $.courierLoginLogUtils.submit.deleteById, search: $.courierLoginLogUtils.submit.search, batch: $.courierLoginLogUtils.submit.batch}}
 */
$.courierLoginLogUtils.submit={
    addCourierLoginLog:function(){
        if($('#addCourierLoginLogForm').valid()){
            $.utils.submit('/courierLoginLog/insert', '#addCourierLoginLogForm', '#addCourierLoginLogDialog', '新增出错~', null, '#courierLoginLogTable', null, '新增成功~');
        }
    },
    updateCourierLoginLog:function(){
        if($('#updateCourierLoginLogForm').valid()){
            $.utils.submit('/courierLoginLog/updateByPrimaryKeySelective', '#updateCourierLoginLogForm', '#updateCourierLoginLogDialog', '修改出错~', null, '#courierLoginLogTable', null, '修改成功~');
        }
    },
    deleteByPrimaryKey:function() {
        $.utils.submit('/courierLoginLog/deleteByPrimaryKey', '#deleteCourierLoginLogForm', '#deleteCourierLoginLogDialog', '修改出错~', null, '#courierLoginLogTable', null, '修改成功~');
    },
    search:function(){

        $("#courierLoginLogTable").bootstrapTable('removeAll');

        //重新传递查询条件,也可以修改URL
        $("#courierLoginLogTable").bootstrapTable('refreshOptions',{
            url:getContextPath() + "/courierLoginLog/selectByPrimaryKey",
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
        var list = $('#courierLoginLogTable').bootstrapTable('getAllSelections');
        //进行Ajax交互处理数据
    }

};

/**
 * 所有额外处理格式化的方法
 * @type {{operation: $.courierLoginLogUtils.formatter.operation}}
 */
$.courierLoginLogUtils.formatter={
    operation:function (value, row) {
        var html =  "<div class='btn-toolbar' role='toolbar'>" +
                    "<button type='button' class='btn btn-info' onclick='$.courierLoginLogUtils.button.selectByPrimaryKey("
                            + row.id
                    +
                    ")'>查看</button>"+
                    "<button type='button' class='btn btn-primary' onclick='$.courierLoginLogUtils.button.updateById("
                            +   row.id
                    +
                    ")'>修改</button>"+
                    "<button type='button' class='btn btn-danger' onclick='$.courierLoginLogUtils.button.deleteByPrimaryKey("
                            +   row.id
                    +
                    ")'>删除</button>"+
                    "</div>";
        return  html;
    }
};


