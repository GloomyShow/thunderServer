

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

            $('#addcourierLoginLogForm').validate({
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



            $('#updatecourierLoginLogForm').validate({
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

        $('#addcourierLoginLogForm div').removeClass('has-error');

        $('#addcourierLoginLogForm').validate().resetForm();

        $('#addcourierLoginLogForm')[0].reset();

        $('#addcourierLoginLogDialog').modal('show');
    },
    deleteByPrimaryKey:function(
            id
    ){

        $("#idForDel").val(id);

        $('#deletecourierLoginLogDialog').modal('show');

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

                    $('#updatecourierLoginLogForm div').removeClass('has-error');

                    $('#updatecourierLoginLogForm').validate().resetForm();

                    $('#updatecourierLoginLogForm')[0].reset();

                    $('#updatecourierLoginLogForm').fill(JSON.parse(data));

                    $('#updatecourierLoginLogDialog').modal('show');
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

        $("#batchcourierLoginLogDialog").modal("show");

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

                    $('#showcourierLoginLogForm')[0].reset();

                    $('#showcourierLoginLogForm').fill(JSON.parse(data));

                    $('#showcourierLoginLogDialog').modal('show');

            }
        });
    }

};

/**
 * 所有直接通过操作与后台进行交互的方法
 * @type {{addcourierLoginLog: $.courierLoginLogUtils.submit.addcourierLoginLog, updateABC: $.courierLoginLogUtils.submit.updatecourierLoginLog, deleteById: $.courierLoginLogUtils.submit.deleteById, search: $.courierLoginLogUtils.submit.search, batch: $.courierLoginLogUtils.submit.batch}}
 */
$.courierLoginLogUtils.submit={
    addcourierLoginLog:function(){
        if($('#addcourierLoginLogForm').valid()){
            $.utils.submit('/courierLoginLog/insert', '#addcourierLoginLogForm', '#addcourierLoginLogDialog', '新增出错~', null, '#courierLoginLogTable', null, '新增成功~');
        }
    },
    updatecourierLoginLog:function(){
        if($('#updatecourierLoginLogForm').valid()){
            $.utils.submit('/courierLoginLog/updateByPrimaryKeySelective', '#updatecourierLoginLogForm', '#updatecourierLoginLogDialog', '修改出错~', null, '#courierLoginLogTable', null, '修改成功~');
        }
    },
    deleteByPrimaryKey:function() {
        $.utils.submit('/courierLoginLog/deleteByPrimaryKey', '#deletecourierLoginLogForm', '#deletecourierLoginLogDialog', '修改出错~', null, '#courierLoginLogTable', null, '修改成功~');
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


