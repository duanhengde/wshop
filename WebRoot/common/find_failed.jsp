<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title></title>
</head>
<body>
<center>
	����鼮�����ڣ�<p>
	<div id="info">�����ڽ���3����Զ��ر�</div>
	<input type="button" value="�رմ���" onclick="closewindow()">
</center>

<script type="text/javascript">
function closewindow()
{
	//window.returnValue=false;
	//window.close();
	
	//window.open('', '_self', '');
    //window.close();
	window.open('http://127.0.0.1:8080/wshop/index.action', '_self', '');
	
}
function clock()
{
	i = i -1;
	
	if(i > 0)
	{
	    document.getElementById("info").innerHTML = "�����ڽ���"+i+"����Զ��ر�";
		setTimeout("clock();",1000);
	}
	else
	{
		closewindow();
	}
}

var i = 4;
clock();
</script>
</body>
</html>