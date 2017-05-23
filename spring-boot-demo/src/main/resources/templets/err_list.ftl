<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<h3>
		发现错误！<a href="${errorLogLink}" target="_blank">点击这里查看详情</a>
	</h3>

	<h3>错误列表：</h3>

	<table border="1px solid #8968CD" style="border-collapse: collapse;">
		<tr>
			<th>错误信息</th>
			<th>错误类名</th>
			<th>更多信息</th>
		</tr>
		<#list errorList as error>
		<tr>
			<td>${error.msg}</td>
			<td>${error.eName!}</td>
			<td>${error.details!}</td>
		</tr>
		</#list>
	</table>
	<div>
	注意：最后那个两个感叹号表示：如果error.eName/error.details的值为空，则用空格代替。感叹号后面也可以加一个缺省字符串，在空值的时候代替空值。如果不加感叹号会报错。
	</div>

</body>
</html>
