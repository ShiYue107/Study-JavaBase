<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page language="java" import="java.util.*,com.exam.pojo.Shopping" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function seeCar() {
		window.location.href="ShoppingCarServlet?flag=_seeCar";
	}
	function addCar() {
		var flag=false;
		var el=document.getElementsByName("goods");
		for (var i = 0; i < el.length; i++) {
			if (el[i].checked) {
				flag=true;
				break;
			}
		}
		if (flag) {
			return true;
		}else{
			alert("对不起，没有选择商品！！！");
			return false;
		}
	}
</script>
</head>
	<%
		List<Shopping> shoppingList=(List<Shopping>)request.getAttribute("sl");
		List<Shopping> carShoppingList=(List<Shopping>)request.getAttribute("scl");
		String msg=(String)request.getAttribute("msg");
	%>
<body>
	<div style="font-size:16px;font-family: 黑体">商品信息列表</div>
	<form action="ShoppingCarServlet?flag=_addCar" method="post">
		<div style="float: left">
			<input type="button" value="加入购物车" onclick="addCar()"/>
		</div>
		<div style="float: right">
			<input type="button" value="查看购物车" onclick="seeCar()"/>
			<%
				if(carShoppingList!=null&&carShoppingList.size()>0){
			%>
			购物车商品总数：<%=carShoppingList.size() %>
			<%
				}
			%>
		</div>
		<div style="clear: both;margin-top: 30px">
			<table width="650" height="200" cellspacing="0" cellpadding="0" class="tong">
				<tr height="20">
					 <td align="center" width="56" id="bortop1">
					 	<div class="liTi"><div class="neiDiv">序号</div>
					 	</div></td>
					 <td align="center" width="56" id="bortop1">
					 	<div class="liTi"><div class="neiDiv">选择</div>
					 	</div></td>
					 <td align="center" width="120" id="bortop1">
					 	<div class="liTi"><div class="neiDiv">商品编号</div>
					 	</div></td>
					 <td align="center" width="80" id="bortop1">
					 	<div class="liTi"><div class="neiDiv">商品名称</div>
					 	</div></td>
					 <td align="center" width="120" id="bortop1">
					 	<div class="liTi"><div class="neiDiv">商品价格</div>
					 	</div></td>
					 <td align="center" width="130" id="bortop2">
					 	<div class="liTi"><div class="neiDiv">出厂日期</div>
					 	</div></td>
					 <td align="center" width="120" id="bortop2">
					 	<div class="liTi"><div class="neiDiv">商品类型</div>
					 	</div></td>
				</tr>
				<%
					for(int i=0;i<shoppingList.size();i++){
				%>
				<tr onmouseover="this.bgColor='#E8F7FF'"
					onmouseout="this.bgColor=#FFFFFF">
					<td id="bord1" align="center"><%=(i+1) %></td>
					<td id="bord1" align="center"><input type="checkbox" name="goods"/
						value="<%=shoppingList.get(i).getNo() %>:
							<%=shoppingList.get(i).getName() %>:
							<%=shoppingList.get(i).getPirce() %>"></td>
					<td id="bor1" align="center"><%=shoppingList.get(i).getNo() %></td>
					<td id="bor1" align="center"><%=shoppingList.get(i).getName() %></td>
					<td id="bor1" align="center"><%=shoppingList.get(i).getPirce() %></td>
					<td id="bor1" align="center"><%=shoppingList.get(i).getDate() %></td>
					<td id="bor2" align="center"><%=shoppingList.get(i).getType() %></td>
				</tr>
				<%
					}
				%>
			</table></br>
			<%
				if(msg!=null){
			%>
			<%=msg%>
			<%
				}
			%>
		</div>
	</form>
</body>
</html>