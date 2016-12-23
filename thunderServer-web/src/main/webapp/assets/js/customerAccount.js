

/**
 * 页面渲染结束后自动执行的类
 */
$(document).ready(function() {
    $.customerAccountUtils.init();
});


/**
 * 所有其他类型的方法
 * @type {{init: $.customerAccountUtils.init, queryList: $.customerAccountUtils.queryList}}
 */
$.customerAccountUtils={
		init:function(){
            $.customerAccountUtils.queryList();
            $.customerAccountUtils.initValid();
		},
		queryList:function(){

            $('#customerAccountTable').bootstrapTable('refreshOptions',{
                url: getContextPath() + "/customerAccount/selectByExample",
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

            $('#addcustomerAccountForm').validate({
                rules:{


                            name : "required",

                            phone : "required",

                            createTime : "required",

                            updateTime : "required",

                },
                messages:{
                        name : "请输入!",
                        phone : "请输入!",
                        createTime : "请输入!",
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



            $('#updatecustomerAccountForm').validate({
            rules:{

                    name : "required",

                    phone : "required",

                    createTime : "required",

                    updateTime : "required",

            },
            messages:{
                    name : "请输入!",
                    phone : "请输入!",
                    createTime : "请输入!",
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
 * @type {{deleteById: $.customerAccountUtils.button.deleteById, updateById: $.customerAccountUtils.button.updateById, deleteBatch: $.customerAccountUtils.button.deleteBatch}}
 */
$.customerAccountUtils.button={
    add:function(){

        $('#addcustomerAccountForm div').removeClass('has-error');

        $('#addcustomerAccountForm').validate().resetForm();

        $('#addcustomerAccountForm')[0].reset();

        $('#addcustomerAccountDialog').modal('show');
    },
    deleteByPrimaryKey:function(
            id
    ){

        $("#idForDel").val(id);

        $('#deletecustomerAccountDialog').modal('show');

    },
    updateById:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/customerAccount/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                //if (response.code != '000') {
                    //如果返回Json中存在标识码等,可以通过下面的方法显示错误信息,
                //    $.utils.alertError(response.message);
              //  } else {
                    var data= $.utils.objToJson(response);

                    $('#updatecustomerAccountForm div').removeClass('has-error');

                    $('#updatecustomerAccountForm').validate().resetForm();

                    $('#updatecustomerAccountForm')[0].reset();

                    $('#updatecustomerAccountForm').fill(JSON.parse(data));

                    $('#updatecustomerAccountDialog').modal('show');
                //}
            }
        });
    },
    operationBatch:function () {
        //获取选中的所有数据
        var list = $('#customerAccountTable').bootstrapTable('getAllSelections');

        if(list == null || list.length == 0){
            $.utils.alertWarning("请选择至少一个数据!");
            return;
        }

        $("#batchcustomerAccountDialog").modal("show");

    },
    selectByPrimaryKey:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/customerAccount/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                    var data= $.utils.objToJson(response);

                    $('#showcustomerAccountForm')[0].reset();

                    $('#showcustomerAccountForm').fill(JSON.parse(data));

                    $('#showcustomerAccountDialog').modal('show');

            }
        });
    }

};

/**
 * 所有直接通过操作与后台进行交互的方法
 * @type {{addcustomerAccount: $.customerAccountUtils.submit.addcustomerAccount, updateABC: $.customerAccountUtils.submit.updatecustomerAccount, deleteById: $.customerAccountUtils.submit.deleteById, search: $.customerAccountUtils.submit.search, batch: $.customerAccountUtils.submit.batch}}
 */
$.customerAccountUtils.submit={
    addcustomerAccount:function(){
        if($('#addcustomerAccountForm').valid()){
            $.utils.submit('/customerAccount/insert', '#addcustomerAccountForm', '#addcustomerAccountDialog', '新增出错~', null, '#customerAccountTable', null, '新增成功~');
        }
    },
    updatecustomerAccount:function(){
        if($('#updatecustomerAccountForm').valid()){
            $.utils.submit('/customerAccount/updateByPrimaryKeySelective', '#updatecustomerAccountForm', '#updatecustomerAccountDialog', '修改出错~', null, '#customerAccountTable', null, '修改成功~');
        }
    },
    deleteByPrimaryKey:function() {
        $.utils.submit('/customerAccount/deleteByPrimaryKey', '#deletecustomerAccountForm', '#deletecustomerAccountDialog', '修改出错~', null, '#customerAccountTable', null, '修改成功~');
    },
    search:function(){

        $("#customerAccountTable").bootstrapTable('removeAll');

        //重新传递查询条件,也可以修改URL
        $("#customerAccountTable").bootstrapTable('refreshOptions',{
            url:getContextPath() + "/customerAccount/selectByPrimaryKey",
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
        var list = $('#customerAccountTable').bootstrapTable('getAllSelections');
        //进行Ajax交互处理数据
    }

};

/**
 * 所有额外处理格式化的方法
 * @type {{operation: $.customerAccountUtils.formatter.operation}}
 */
$.customerAccountUtils.formatter={
    operation:function (value, row) {
        var html =  "<div class='btn-toolbar' role='toolbar'>" +
                    "<button type='button' class='btn btn-info' onclick='$.customerAccountUtils.button.selectByPrimaryKey("
                            + row.id
                    +
                    ")'>查看</button>"+
                    "<button type='button' class='btn btn-primary' onclick='$.customerAccountUtils.button.updateById("
                            +   row.id
                    +
                    ")'>修改</button>"+
                    "<button type='button' class='btn btn-danger' onclick='$.customerAccountUtils.button.deleteByPrimaryKey("
                            +   row.id
                    +
                    ")'>删除</button>"+
                    "</div>";
        return  html;
    }
};


