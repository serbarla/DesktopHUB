<?php
		@$r7=$_POST["btn7"];
		@$r8=$_POST["btn8"];
		@$r9=$_POST["btn9"];
		session_start();
					if(isset($r7)){
							if($r7=="1"){
								$_SESSION['puntuacion']++;
							}else{ }	
					}	
					else{
				 	if(isset($r8)){
							if($r8=="1"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					else{
							if($r9=="1"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					}
					

	
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/style.css" type="text/css">
<title>Resultados</title>
</head>
	<div id="header">
		<div>
			<div id="logo">
				<a href="index.html"><img src="images/logo.png" width="1000" height="130" alt="LOGO"></a>
			</div>
		</div>
	</div>
<body>
		<div id="forma">
			<h1>Tu Puntuación es:  <?php echo $_SESSION['puntuacion'];?>/3</h1> 
            <a href="index.html"><img src="images/botones/retorno.png" width="330" height="71" onMouseOver="this.src='images/botones/retornob.png'" onMouseOut="this.src='images/botones/retorno.png'" alt="retorno"></a>
		</div>
</body>
</html>