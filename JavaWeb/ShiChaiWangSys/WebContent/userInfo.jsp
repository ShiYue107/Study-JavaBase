<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>拾柴网项目众筹平台</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/theme.css">
	<style>
#footer {
    padding: 15px 0;
    background: #fff;
    border-top: 1px solid #ddd;
    text-align: center;
}
#topcontrol {
  color: #fff;
  z-index: 99;
  width: 30px;
  height: 30px;
  font-size: 20px;
  background: #222;
  position: relative;
  right: 14px !important;
  bottom: 11px !important;
  border-radius: 3px !important;
}

#topcontrol:after {
  /*top: -2px;*/
  left: 8.5px;
  content: "\f106";
  position: absolute;
  text-align: center;
  font-family: FontAwesome;
}

#topcontrol:hover {
    color: #fff;
    background: #18ba9b;
    -webkit-transition: all 0.3s ease-in-out;
    -moz-transition: all 0.3s ease-in-out;
    -o-transition: all 0.3s ease-in-out;
    transition: all 0.3s ease-in-out;
}

	</style>
</head>
<body>
	<div class="navbar-wrapper">
      <div class="container">
			<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			  <div class="container">
				<div class="navbar-header">
				  <a class="navbar-brand" href="#" style="font-size:32px;">拾柴网项目众筹平台</a>
				</div>
            <div id="navbar" class="navbar-collapse collapse" style="float:right;">
              <ul class="nav navbar-nav">
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i> 张三<span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="#"><i class="glyphicon glyphicon-scale"></i> 会员中心</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-comment"></i> 消息</a></li>
                    <li class="divider"></li>
                    <li><a href="index.jsp"><i class="glyphicon glyphicon-off"></i> 退出系统</a></li>
                  </ul>
                </li>
              </ul>
            </div>
			  </div>
			</nav>

      </div>
    </div>
<div class="container">
	<div class="row clearfix">
		<div class="col-sm-3 col-md-3 column">
			<div class="row">
				<div class="col-md-12">
					<div class="thumbnail" style="    border-radius: 0px;">
						<img src="img/services-box1.jpg" class="img-thumbnail" alt="A generic square placeholder image with a white border around it, making it resemble a photograph taken with an old instant camera">
						<div class="caption" style="text-align:center;">
							<h3>
								ZhangSan
							</h3>
						</div>
					</div>
				</div>
			</div>
			
		</div>
            <div class="col-sm-9 col-md-9 column">
              <ul id="myTab" style="" class="nav nav-pills" role="tablist">
                <li role="presentation" class="active"><a href="#home" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">我的众筹</a></li>
                <li role="presentation"><a href="#profile">众筹资产</a></li>
              </ul>
              <div id="myTabContent" class="tab-content" style="margin-top:10px;">
                  <div role="tabpanel" class="tab-pane fade active in" id="home" aria-labelledby="home-tab">
                  
                        <ul id="myTab1" class="nav nav-tabs">
                          <li role="presentation" class="active"><a href="#support">我支持的</a></li>
                          <li role="presentation"><a href="#attension">我关注的</a></li>
                          <li role="presentation"><a href="#add">我发起的</a></li>
                            <li class=" pull-right">
                            	<form action="start.jsp">
                                 	<input type="submit" class="btn btn-warning" value="发起众筹" />
                            	</form>
                            </li>
                        </ul>                  
                        <div id="myTab1" class="tab-content" style="margin-top:10px;">
                            <div role="tabpanel" class="tab-pane fade active in" id="support" aria-labelledby="home-tab">
                                <div class="container-fluid">
                                    <div class="row clearfix">
                                        <div class="col-md-12 column" style="margin-top:10px;padding:0;">
                                            <table class="table table-bordered" style="text-align:center;">
                                              <thead>
                                                <tr style="background-color:#ddd;">
                                                  <td>项目信息</td>
                                                  <td width="90">支持日期</td>
                                                  <td width="120">支持金额（元）</td>
                                                  <td width="80">回报数量</td>
                                                  <td width="80">交易状态</td>
                                                  <td width="120">操作</td>
                                                </tr>
                                              </thead>
                                              <tbody>
                                                <tr>
                                                  <td style="vertical-align:middle;">
                                                    <div class="thumbnail">
                                                        <div class="caption">
                                                            <h3>
                                                                活性富氢净水直饮机
                                                            </h3>
                                                            <p>
                                                                订单编号:2x002231111
                                                            </p>
                                                            <p>
                                                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> 已完成 100% </div>
                                                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 剩余8天 </div>
                                                            </p>
                                                            <br>
                                                                <div class="progress" style="margin-bottom: 4px;">
                                                                  <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                                                    <span >众筹中</span>
                                                                  </div>
                                                                </div>
                                                        </div>
                                                    </div>
                                                  </td>
                                                  <td style="vertical-align:middle;">2017-05-23 11:31:22</td>
                                                  <td style="vertical-align:middle;">1.00<br>(运费：0.00 )</td>
                                                  <td style="vertical-align:middle;">1</td>
                                                  <td style="vertical-align:middle;">交易关闭</td>
                                                  <td style="vertical-align:middle;">
                                                    <div class="btn-group-vertical" role="group" aria-label="Vertical button group">
                                                          <button type="button" class="btn btn-default">删除订单</button>
                                                          <button type="button" class="btn btn-default">交易详情</button>
                                                    </div>
                                                  </td>
                                                </tr>
                                                <tr>
                                                  <td style="vertical-align:middle;">
                                                    <div class="thumbnail">
                                                        <div class="caption">
                                                            <h3>
                                                                BAVOSN便携折叠移动电源台灯
                                                            </h3>
                                                            <p>
                                                                订单编号:2x002231111
                                                            </p>
                                                            <p>
                                                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> 已完成 100% </div>
                                                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 剩余8天 </div>
                                                            </p>
                                                            <br>
                                                                <div class="progress" style="margin-bottom: 4px;">
                                                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                                                    <span >众筹成功</span>
                                                                  </div>
                                                                </div>
                                                        </div>
                                                    </div>
                                                  </td>
                                                  <td style="vertical-align:middle;">2017-05-23 11:31:22</td>
                                                  <td style="vertical-align:middle;">1.00<br>(运费：0.00 )</td>
                                                  <td style="vertical-align:middle;">1</td>
                                                  <td style="vertical-align:middle;">交易关闭</td>
                                                  <td style="vertical-align:middle;">
                                                    <div class="btn-group-vertical" role="group" aria-label="Vertical button group">
                                                          <button type="button" class="btn btn-default">删除订单</button>
                                                          <button type="button" class="btn btn-default">交易详情</button>
                                                    </div>
                                                  </td>
                                                </tr>
                                              </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div role="tabpanel" class="tab-pane fade" id="attension" aria-labelledby="attension-tab">
                                <div class="container-fluid">
                                    <div class="row clearfix">
                                        <div class="col-md-12 column" style="padding:0;">
                                            <table class="table table-bordered" style="text-align:center;">
                                              <thead>
                                                <tr style="background-color:#ddd;">
                                                  <td>项目信息</td>
                                                  <td width="120">支持人数</td>
                                                  <td width="120">关注人数</td>
                                                  <td width="120">操作</td>
                                                </tr>
                                              </thead>
                                              <tbody>
                                                <tr>
                                                  <td style="vertical-align:middle;">
                                                    <div class="thumbnail">
                                                        <div class="caption">
                                                            <p>
                                                                BAVOSN便携折叠移动电源台灯
                                                            </p>
                                                            <p>
                                                                <i class="glyphicon glyphicon-jpy"></i> 已筹集 1000.0元
                                                            </p>
                                                            <p>
                                                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> 已完成 100% </div>
                                                                <div style="float:right;"><i class="glyphicon glyphicon-calendar"></i> 剩余2天 </div>
                                                            </p>
                                                            <br>
                                                                <div class="progress" style="margin-bottom: 4px;">
                                                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                                                    <span >众筹中</span>
                                                                  </div>
                                                                </div>
                                                        </div>
                                                    </div>
                                                  </td>
                                                  <td style="vertical-align:middle;">1</td>
                                                  <td style="vertical-align:middle;">1</td>
                                                  <td style="vertical-align:middle;">
                                                    <div class="btn-group-vertical" role="group" aria-label="Vertical button group">
                                                          <button type="button" class="btn btn-default">取消关注</button>
                                                    </div>
                                                  </td>
                                                </tr>
                                              </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div role="tabpanel" class="tab-pane fade  " id="add" aria-labelledby="add-tab">
                                <div class="container-fluid">
                                    <div class="row clearfix">
                                        <div class="col-md-12 column">
                                             <span class="label label-warning">全部</span> <span class="label" style="color:#000;">众筹中</span> <span class="label " style="color:#000;">众筹成功</span>  <span class="label " style="color:#000;">众筹失败</span>
                                        </div>
                                        <div class="col-md-12 column" style="padding:0;margin-top:10px;">
                                            <table class="table table-bordered" style="text-align:center;">
                                              <thead>
                                                <tr style="background-color:#ddd;">
                                                  <td>项目信息</td>
                                                  <td width="120">募集金额（元）</td>
                                                  <td width="80">当前状态</td>
                                                  <td width="120">操作</td>
                                                </tr>
                                              </thead>
                                              <tbody>
	                                              <c:forEach var="prj" items="${list }">	
	                                                <tr>
	                                                  <td style="vertical-align:middle;">
	                                                    <div class="thumbnail">
	                                                        <div class="caption">
	                                                            <p>
	                                                                <c:out value="${prj.projectName }"></c:out>
	                                                            </p>
	                                                            <p>
	                                                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> 已完成 100% </div>
	                                                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 剩余8天 </div>
	                                                            </p>
	                                                            <br>
	                                                                <div class="progress" style="margin-bottom: 4px;">
	                                                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
	                                                                    <span >众筹中</span>
	                                                                  </div>
	                                                                </div>
	                                                        </div>
	                                                    </div>
	                                                  </td>
	                                                  <td style="vertical-align:middle;">1.00<br>(运费：0.00 )</td>
	                                                  <td style="vertical-align:middle;">草稿</td>
	                                                  <td style="vertical-align:middle;">
	                                                    <div class="btn-group-vertical" role="group" aria-label="Vertical button group">
	                                                          <button type="button" class="btn btn-default">项目预览</button>
	                                                          <button type="button" class="btn btn-default">修改项目</button>
	                                                          <button type="button" class="btn btn-default">删除项目</button>
	                                                          <button type="button" class="btn btn-default">问题管理</button>
	                                                    </div>
	                                                  </td>
	                                                </tr>
	                                              </c:forEach>
                                              </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>                            
                        </div>
                  
                  </div>
                  <div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
                  众筹资产
                  </div>
            </div>
		</div>
	</div>
</div>
        <div class="container" style="margin-top:20px;">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <div id="footer">
                        <div class="footerNav">
                             <a rel="nofollow" href="aboutWe.jsp">关于我们</a> | <a rel="nofollow" href="#">服务条款</a> | <a rel="nofollow" href="#">免责声明</a> | <a rel="nofollow" href="#">网站地图</a> | <a rel="nofollow" href="#">联系我们</a>
                        </div>
                        <div class="copyRight">
                            Copyright 2019-2022 云南理工职业学院 对不队项目组 版权所有
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>
    <script src="jquery/jquery-2.1.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
	<script src="script/docs.min.js"></script>
    <script src="script/back-to-top.js"></script>
	<script>
$('#myTab a').click(function (e) {
  e.preventDefault()
  $(this).tab('show')
})
$('#myTab1 a').click(function (e) {
  e.preventDefault()
  $(this).tab('show')
})
	</script>
</body>
</html>