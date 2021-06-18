<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function test01() 
	{
		location.href="/07_MVC_01/MyController?cmd=hello";
	}
	function test02() 
	{
		location.href="/07_MVC_01/MyController?cmd=hi";
	}
	function test03() 
	{
		location.href="/07_MVC_01/MyController?cmd=bye";
	}
	
	// 무조건 post 방식이어야 한다. get방식 오류난다.
	function test04(f) 
	{
		f.action="/07_MVC_01/MyController?cmd=hello";
		f.submit();
	}
	function test05(f) 
	{
		f.action="/07_MVC_01/MyController?cmd=hi";
		f.submit();
	}
	function test06(f) 
	{
		f.action="/07_MVC_01/MyController?cmd=bye";
		f.submit();
	}
</script>
</head>
<body>
	<button onclick="test01()">Hello</button>
	<button onclick="test02()">Hi</button>
	<button onclick="test03()">Bye</button>
	<hr>
	
	<form action="/07_MVC_01/MyController" method="post">
		<input type="submit" value="Hello">
		<input type="hidden" name="cmd" value="Hello">
	</form>
	
	<form action="/07_MVC_01/MyController" method="post">
		<input type="submit" value="Hi">
		<input type="hidden" name="cmd" value="Hi">
	</form>
	
	<form action="/07_MVC_01/MyController" method="post">
		<input type="submit" value="Bye">
		<input type="hidden" name="cmd" value="Bye">
	</form>
	<hr>
	
	<form action="" method="post">
		<input type="button" value="Hello" onclick="test04(this.form)">
		<input type="button" value="Hi" onclick="test05(this.form)">
		<input type="button" value="Bye" onclick="test06(this.form)">
	</form>
	
	<hr>
	<%-- MVC페턴으로 이름, 영어, 국어, 수학을 받아서 총점,평균,학점을 구해라 --%>
	<div>
   <h2> 성적 입력 </h2>
   <form action="/07_MVC_01/MyController" method="post">
      <table>
         <tbody>
            <tr><td>이름 </td><td><input type="text" name="name" required></td> </tr>
            <tr><td>국어 </td><td><input type="number" name="kor" required></td> </tr>
            <tr><td>영어 </td><td><input type="number" name="eng" required></td> </tr>
            <tr><td>수학 </td><td><input type="number" name="math" required></td> </tr>
         </tbody>
         <tfoot>
         	<input type="hidden" name="cmd" value="grades">
            <tr><td colspan="2"><input type="submit" value="성적확인"></td></tr>
         </tfoot>
      </table>
   </form>
   </div>
	
</body>
</html>







