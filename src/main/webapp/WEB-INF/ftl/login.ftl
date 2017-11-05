<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>登录</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #016aa9;
	overflow:hidden;
}
.STYLE1 {
	color: #000000;
	font-size: 12px;
}
-->
</style></head>

<body>
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td><table width="962" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="235" background="images/login_03.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="53"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="394" height="53" background="images/login_05.gif">&nbsp;</td>
            <td width="206" background="images/login_06.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="16%" height="25"><div align="right"><span class="STYLE1">用户名</span></div></td>
                <td width="57%" height="25"><div align="center">
                  <input id="100" type="text" name="uname" style="width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff">
                </td>
                <td width="27%" height="25">&nbsp;</td>
              </tr>
              <tr>
                <td height="25"><div align="right"><span class="STYLE1">密码</span></div></td>
                <td height="25"><div align="center">
                  <input id="200" type="password" name="upass" style="width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff">
                </td>
                <td height="25"><div align="left"><img src="images/dl.gif" width="49" height="18" border="0" id="300"></div></td>
              </tr>
            </table></td>
            <td width="362" background="images/login_07.gif">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="213" background="images/login_08.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
	<script type="text/javascript" src="/js/jquery.js"></script>
	<script type="text/javascript">
		$(function(){
			<#if errormsg?? >
				alert("${errormsg}");
			</#if>		
			$("#300").click(function(){
					var $url = "login.do?uname="+$("#100").val()+"&upass="+$("#200").val();
					window.location.href=$url;
			});
		});
	</script>
</html>
