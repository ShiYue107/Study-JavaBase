<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
h3.break {
    font-size:16px;
    display: block;
    white-space: nowrap;
    word-wrap: normal;
    overflow: hidden;
    text-overflow: ellipsis;
}
h3.break>a {
    text-decoration:none;
}
	</style>
</head>
<body>
	<div class="navbar-wrapper">
      <div class="container">
			<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			  <div class="container">
				<div class="navbar-header">
				  <a class="navbar-brand" href="#" style="font-size:32px;">互联网众筹系统</a>
				</div>
            <div id="navbar" class="navbar-collapse collapse" style="float:right;">
              <ul class="nav navbar-nav">
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i> 张三<span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="userInfo.jsp"><i class="glyphicon glyphicon-scale"></i> 会员中心</a></li>
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

    <div class="container theme-showcase" role="main">

        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <nav class="navbar navbar-default" role="navigation">
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                                <li class="active">
                                    <a rel="nofollow" href="javascript:;"><i class="glyphicon glyphicon-th-large"></i> 项目总览</a>
                                </li>
                                <li>
                                    <a rel="nofollow" href="start.jsp"><i class="glyphicon glyphicon-edit"></i> 发起众筹</a>
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
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <ul id="typeList" style="list-style: none;">
                                <li>
                                    分类：<span class="label-type actvie">全部</span> <span class="label-text">科技</span> <span class="label-text">设计</span> <span class="label-text">公益</span> <span class="label-text">农业</span> <span class="label-text">文化</span>
                                </li>
                                <li>
                                    状态：<span class="label-status actvie">全部</span> <span class="label-text">即将开始</span> <span class="label-text">众筹中</span> <span class="label-text">众筹成功</span> 
                                </li>
                                <li>
                                    排序：<span class="label-order actvie">综合排序</span> <span class="label-text">最新上线</span> <span class="label-text">金额最多</span> <span class="label-text">支持最多</span>
                                </li>
                            </ul>
                        </div>
                        <div class="panel-footer" style="height:50px;padding:0;">
                            <div style="float:left;padding:15px;">
                            共216个众筹项目
                            </div>
                            <div style="float:right;">
                                <form class="navbar-form navbar-left" role="search">
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="请输入搜索内容">
                                    </div>
                                    <button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i> 搜索</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-1.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">活性富氢净水直饮机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-2.gif" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">酷驰触控龙头，智享厨房黑科技</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-3.png" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">小熊猫鱼眼全景安防摄像机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-4.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">一款精致的机械表</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-1.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">活性富氢净水直饮机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-2.gif" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">酷驰触控龙头，智享厨房黑科技</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-3.png" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">小熊猫鱼眼全景安防摄像机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-4.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">一款精致的机械表</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-1.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">活性富氢净水直饮机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-2.gif" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">酷驰触控龙头，智享厨房黑科技</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-3.png" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">小熊猫鱼眼全景安防摄像机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-4.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.jsp">一款精致的机械表</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>
</div>
        
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column" style="text-align:center">
                    <ul class="pagination">
                        <li>
                            <a rel="nofollow" href="#">上一页</a>
                        </li>
                        <li>
                            <a rel="nofollow" href="#">1</a>
                        </li>
                        <li>
                            <a rel="nofollow" href="#">2</a>
                        </li>
                        <li>
                            <a rel="nofollow" href="#">3</a>
                        </li>
                        <li>
                            <a rel="nofollow" href="#">4</a>
                        </li>
                        <li>
                            <a rel="nofollow" href="#">5</a>
                        </li>
                        <li>
                            <a rel="nofollow" href="#">下一页</a>
                        </li>
                    </ul>
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