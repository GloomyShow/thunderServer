

/**
 * 页面渲染结束后自动执行的类
 */
$(document).ready(function() {
    $.customerLoginLogUtils.init();
});


/**
 * 所有其他类型的方法
 * @type {{init: $.customerLoginLogUtils.init, queryList: $.customerLoginLogUtils.queryList}}
 */
$.customerLoginLogUtils={
		init:function(){
            $.customerLoginLogUtils.queryList();
            $.customerLoginLogUtils.initValid();
		},
		queryList:function(){

            $('#customerLoginLogTable').bootstrapTable('refreshOptions',{
                url: getContextPath() + "/customerLoginLog/selectByExample",
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

            $('#addCustomerLoginLogForm').validate({
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



            $('#updateCustomerLoginLogForm').validate({
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
 * @type {{deleteById: $.customerLoginLogUtils.button.deleteById, updateById: $.customerLoginLogUtils.button.updateById, deleteBatch: $.customerLoginLogUtils.button.deleteBatch}}
 */
$.customerLoginLogUtils.button={
    add:function(){

        $('#addCustomerLoginLogForm div').removeClass('has-error');

        $('#addCustomerLoginLogForm').validate().resetForm();

        $('#addCustomerLoginLogForm')[0].reset();

        $('#addCustomerLoginLogDialog').modal('show');
    },
    deleteByPrimaryKey:function(
            id
    ){

        $("#idForDel").val(id);

        $('#deleteCustomerLoginLogDialog').modal('show');

    },
    updateById:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/customerLoginLog/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                //if (response.code != '000') {
                    //如果返回Json中存在标识码等,可以通过下面的方法显示错误信息,
                //    $.utils.alertError(response.message);
              //  } else {
                    var data= $.utils.objToJson(response);

                    $('#updateCustomerLoginLogForm div').removeClass('has-error');

                    $('#updateCustomerLoginLogForm').validate().resetForm();

                    $('#updateCustomerLoginLogForm')[0].reset();

                    $('#updateCustomerLoginLogForm').fill(JSON.parse(data));

                    $('#updateCustomerLoginLogDialog').modal('show');
                //}
            }
        });
    },
    operationBatch:function () {
        //获取选中的所有数据
        var list = $('#customerLoginLogTable').bootstrapTable('getAllSelections');

        if(list == null || list.length == 0){
            $.utils.alertWarning("请选择至少一个数据!");
            return;
        }

        $("#batchCustomerLoginLogDialog").modal("show");

    },
    selectByPrimaryKey:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/customerLoginLog/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                    var data= $.utils.objToJson(response);

                    $('#showCustomerLoginLogForm')[0].reset();

                    $('#showCustomerLoginLogForm').fill(JSON.parse(data));

                    $('#showCustomerLoginLogDialog').modal('show');

            }
        });
    }

};

/**
 * 所有直接通过操作与后台进行交互的方法
 * @type {{addCustomerLoginLog: $.customerLoginLogUtils.submit.addCustomerLoginLog, updateABC: $.customerLoginLogUtils.submit.updateCustomerLoginLog, deleteById: $.customerLoginLogUtils.submit.deleteById, search: $.customerLoginLogUtils.submit.search, batch: $.customerLoginLogUtils.submit.batch}}
 */
$.customerLoginLogUtils.submit={
    addCustomerLoginLog:function(){
        if($('#addCustomerLoginLogForm').valid()){
            $.utils.submit('/customerLoginLog/insert', '#addCustomerLoginLogForm', '#addCustomerLoginLogDialog', '新增出错~', null, '#customerLoginLogTable', null, '新增成功~');
        }
    },
    updateCustomerLoginLog:function(){
        if($('#updateCustomerLoginLogForm').valid()){
            $.utils.submit('/customerLoginLog/updateByPrimaryKeySelective', '#updateCustomerLoginLogForm', '#updateCustomerLoginLogDialog', '修改出错~', null, '#customerLoginLogTable', null, '修改成功~');
        }
    },
    deleteByPrimaryKey:function() {
        $.utils.submit('/customerLoginLog/deleteByPrimaryKey', '#deleteCustomerLoginLogForm', '#deleteCustomerLoginLogDialog', '修改出错~', null, '#customerLoginLogTable', null, '修改成功~');
    },
    search:function(){

        $("#customerLoginLogTable").bootstrapTable('removeAll');

        //重新传递查询条件,也可以修改URL
        $("#customerLoginLogTable").bootstrapTable('refreshOptions',{
            url:getContextPath() + "/customerLoginLog/selectByPrimaryKey",
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
        var list = $('#customerLoginLogTable').bootstrapTable('getAllSelections');
        //进行Ajax交互处理数据
    }

};

/**
 * 所有额外处理格式化的方法
 * @type {{operation: $.customerLoginLogUtils.formatter.operation}}
 */
$.customerLoginLogUtils.formatter={
    operation:function (value, row) {
        var html =  "<div class='btn-toolbar' role='toolbar'>" +
                    "<button type='button' class='btn btn-info' onclick='$.customerLoginLogUtils.button.selectByPrimaryKey("
                            + row.id
                    +
                    ")'>查看</button>"+
                    "<button type='button' class='btn btn-primary' onclick='$.customerLoginLogUtils.button.updateById("
                            +   row.id
                    +
                    ")'>修改</button>"+
                    "<button type='button' class='btn btn-danger' onclick='$.customerLoginLogUtils.button.deleteByPrimaryKey("
                            +   row.id
                    +
                    ")'>删除</button>"+
                    "</div>";
        return  html;
    }
};


