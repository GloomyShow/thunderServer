

/**
 * 页面渲染结束后自动执行的类
 */
$(document).ready(function() {
    $.courierAccountUtils.init();
});


/**
 * 所有其他类型的方法
 * @type {{init: $.courierAccountUtils.init, queryList: $.courierAccountUtils.queryList}}
 */
$.courierAccountUtils={
		init:function(){
            $.courierAccountUtils.queryList();
            $.courierAccountUtils.initValid();
		},
		queryList:function(){

            $('#courierAccountTable').bootstrapTable('refreshOptions',{
                url: getContextPath() + "/courierAccount/selectByExample",
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

            $('#addcourierAccountForm').validate({
                rules:{


                            name : "required",

                            phone : "required",








                            createdTime : "required",

                            updateTime : "required",

                },
                messages:{
                        name : "请输入!",
                        phone : "请输入!",
                        createdTime : "请输入!",
                        updateTime : "请输入!",

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



            $('#updatecourierAccountForm').validate({
            rules:{

                    name : "required",

                    phone : "required",








                    createdTime : "required",

                    updateTime : "required",

            },
            messages:{
                    name : "请输入!",
                    phone : "请输入!",
                    createdTime : "请输入!",
                    updateTime : "请输入!",

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
 * @type {{deleteById: $.courierAccountUtils.button.deleteById, updateById: $.courierAccountUtils.button.updateById, deleteBatch: $.courierAccountUtils.button.deleteBatch}}
 */
$.courierAccountUtils.button={
    add:function(){

        $('#addcourierAccountForm div').removeClass('has-error');

        $('#addcourierAccountForm').validate().resetForm();

        $('#addcourierAccountForm')[0].reset();

        $('#addcourierAccountDialog').modal('show');
    },
    deleteByPrimaryKey:function(
            id
    ){

        $("#idForDel").val(id);

        $('#deletecourierAccountDialog').modal('show');

    },
    updateById:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/courierAccount/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                //if (response.code != '000') {
                    //如果返回Json中存在标识码等,可以通过下面的方法显示错误信息,
                //    $.utils.alertError(response.message);
              //  } else {
                    var data= $.utils.objToJson(response);

                    $('#updatecourierAccountForm div').removeClass('has-error');

                    $('#updatecourierAccountForm').validate().resetForm();

                    $('#updatecourierAccountForm')[0].reset();

                    $('#updatecourierAccountForm').fill(JSON.parse(data));

                    $('#updatecourierAccountDialog').modal('show');
                //}
            }
        });
    },
    operationBatch:function () {
        //获取选中的所有数据
        var list = $('#courierAccountTable').bootstrapTable('getAllSelections');

        if(list == null || list.length == 0){
            $.utils.alertWarning("请选择至少一个数据!");
            return;
        }

        $("#batchcourierAccountDialog").modal("show");

    },
    selectByPrimaryKey:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/courierAccount/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                    var data= $.utils.objToJson(response);

                    $('#showcourierAccountForm')[0].reset();

                    $('#showcourierAccountForm').fill(JSON.parse(data));

                    $('#showcourierAccountDialog').modal('show');

            }
        });
    }

};

/**
 * 所有直接通过操作与后台进行交互的方法
 * @type {{addcourierAccount: $.courierAccountUtils.submit.addcourierAccount, updateABC: $.courierAccountUtils.submit.updatecourierAccount, deleteById: $.courierAccountUtils.submit.deleteById, search: $.courierAccountUtils.submit.search, batch: $.courierAccountUtils.submit.batch}}
 */
$.courierAccountUtils.submit={
    addcourierAccount:function(){
        if($('#addcourierAccountForm').valid()){
            $.utils.submit('/courierAccount/insert', '#addcourierAccountForm', '#addcourierAccountDialog', '新增出错~', null, '#courierAccountTable', null, '新增成功~');
        }
    },
    updatecourierAccount:function(){
        if($('#updatecourierAccountForm').valid()){
            $.utils.submit('/courierAccount/updateByPrimaryKeySelective', '#updatecourierAccountForm', '#updatecourierAccountDialog', '修改出错~', null, '#courierAccountTable', null, '修改成功~');
        }
    },
    deleteByPrimaryKey:function() {
        $.utils.submit('/courierAccount/deleteByPrimaryKey', '#deletecourierAccountForm', '#deletecourierAccountDialog', '修改出错~', null, '#courierAccountTable', null, '修改成功~');
    },
    search:function(){

        $("#courierAccountTable").bootstrapTable('removeAll');

        //重新传递查询条件,也可以修改URL
        $("#courierAccountTable").bootstrapTable('refreshOptions',{
            url:getContextPath() + "/courierAccount/selectByPrimaryKey",
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
        var list = $('#courierAccountTable').bootstrapTable('getAllSelections');
        //进行Ajax交互处理数据
    }

};

/**
 * 所有额外处理格式化的方法
 * @type {{operation: $.courierAccountUtils.formatter.operation}}
 */
$.courierAccountUtils.formatter={
    operation:function (value, row) {
        var html =  "<div class='btn-toolbar' role='toolbar'>" +
                    "<button type='button' class='btn btn-info' onclick='$.courierAccountUtils.button.selectByPrimaryKey("
                            + row.id
                    +
                    ")'>查看</button>"+
                    "<button type='button' class='btn btn-primary' onclick='$.courierAccountUtils.button.updateById("
                            +   row.id
                    +
                    ")'>修改</button>"+
                    "<button type='button' class='btn btn-danger' onclick='$.courierAccountUtils.button.deleteByPrimaryKey("
                            +   row.id
                    +
                    ")'>删除</button>"+
                    "</div>";
        return  html;
    }
};


