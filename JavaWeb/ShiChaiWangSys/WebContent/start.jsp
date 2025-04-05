<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>拾柴网项目众筹平台</title>
<meta charset="GB18030">
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

.label-type, .label-status, .label-order {
    background-color: #fff;
    color: #f60;
    padding : 5px;
    border: 1px #f60 solid;
}
#typeList  :not(:first-child) {
    margin-top:20px;
}
.label-text {
    margin:0 10px;
}
.panel {
    border-radius:0;
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
                    <li><a href="#">会员中心</a></li>
                    <li><a href="#">消息 <span class="badge badge-success">42</span></a></li>
                    <li class="divider"></li>
                    <li><a href="index.jsp">退出系统</a></li>
                  </ul>
                </li>
              </ul>
            </div>
			  </div>
			</nav>
      </div>
    </div>

    <div class="container theme-showcase" role="main">

        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <nav class="navbar navbar-default" role="navigation">
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                                <li >
                                    <a rel="nofollow" href="projects.jsp"><i class="glyphicon glyphicon-th-large"></i> 项目总览</a>
                                </li>
                                <li class="active">
                                    <a rel="nofollow" href="javascript:;"><i class="glyphicon glyphicon-edit"></i> 发起项目</a>
                                </li>
                                <li>
                                    <a rel="nofollow" href="userInfo.jsp"><i class="glyphicon glyphicon-user"></i> 我的众筹</a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
        
        
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <div class="panel panel-default" >
                        <div class="panel-heading" style="text-align:center;">
                            <h3 >
                                拾柴网项目众筹平台项目发起人协议
                            </h3>
                        </div>
                        <div class="panel-body" style="height:400px;overflow-y:auto;padding:10px;">
				<div class="test-box">
					<p><b>在发起人使用拾柴网项目众筹平台提供的服务之前，请务必认真阅读本协议的全部内容。阅读本协议的过程中，如您不同意本协议或其中任何条款约定，您应立即停止注册（如：点击确认等后续操作），撤销注册流程。本协议一经发起人点击确认并同意接受，即产生法律效力。
					</b></p>
					<h5>第1条  签约主体</h5>
					<p>本协议由拾柴网网站（包括但不限于www.atcrowd.com及拾柴网众筹平台）的所有者及其关联公司（以下简称为“拾柴网”）。</p>
					<h5>第2条  拾柴网项目众筹平台：拾柴网项目众筹平台是一个可以让发起人的项目计划变为现实的梦想平台，是“致力于中国创造，实现创新创业者梦想”的平台，发起人可以在拾柴网项目众筹平台上发起创新项目的筹款需求，并承诺提供不同形式的回报给项目的支持者，支持者可通过预购发起人的项目成果或相关产品来表达对发起人的支持。</h5>
					<h5>第3条  立约背景为保护支持者的合法权益，规范发起人的行为，维护拾柴网项目众筹平台的秩序，特拟定本协议。</h5>
					<h5>第4条  协议生效和适用范围</h5>
					<p>本协议内容包括协议正文以及拾柴网网站已经发布的或将来可能发布的各类规则、操作流程。所有规则为本协议不可分割的一部分，与协议正文具有同等的法律效力。</p>
					<h5>第5条  项目发起人资格</h5>
					<p>项目发起人应为拾柴网项目众筹平台的注册用户，完全理解并接受本协议。</p>
					<h5>第6条  项目内容规范</h5>
					<p>在拾柴网项目众筹平台上发起的项目应为具有创新性质且具有可执行性的项目，且项目目标须是明确、具体、可衡量的，如制作一个实物产品、拍一部微电影或完成一件艺术创作等。不得在无实质项目内容的情况下纯粹为公益组织发起募捐或以发起类似“资助奖学金”、“资助我去旅游”等为满足发起人个人需求之目的筹款。</p>
					<h5>第7条  项目回报规范</h5>
					<p>发起人承诺，如项目众筹成功，及时兑现对项目支持者承诺的回报；如项目众筹失败，同意尚筹网将众筹款项及时退还项目支持者，并由发起人就项目众筹失败的原因等对项目支持者做出解释。</p>
					<h5>第8条  发起人行为规范</h5>
					<p>项目审核通过后，发起人除可修改项目启动时间外，不得编辑、修改其他项目内容。</p>
					<h5>第9条  支持款交付及平台服务费</h5>
					<h5>第10条  知识产权</h5>
					<h5>第11条  纠纷处理</h5>
					<h5>第12条  违规处理</h5>
					<h5>第13条  违约责任</h5>
					<h5>第14条  协议终止及争议解决</h5>
					<p>本协议的解释权归拾柴网项目众筹平台所有。</p>
				</div>
                        </div>
                        <div class="panel-footer" style="text-align:center;">
                            <button type="button" class="btn  btn-warning btn-lg" onclick="window.location.href='start1.jsp'">阅读并同意协议</button>
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
							Copyright2019-2022云南理工职业学院 对不队项目组 版权所有
						</div>
                    </div>
                    
                </div>
            </div>
        </div>
      
    </div> <!-- /container -->
    <script src="jquery/jquery-2.1.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
	<script src="script/docs.min.js"></script>
    <script src="script/back-to-top.js"></script>
	<script>
$('#myTab a').click(function (e) {
  e.preventDefault()
  $(this).tab('show')
})
	</script>
</body>
</html>