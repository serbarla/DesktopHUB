<?php
	$pos1=rand(1, 5);
	$pos2=rand(6, 10);
	$pos3=rand(11, 15);
	session_start();
	$_SESSION['animal'];

?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/style.css" type="text/css">
<title>Juegos Retención</title>
</head>
	<div id="header">
		<div>
			<div id="logo">
				<a href="index.html"><img src="images/logo.png" width="1000" height="130" alt="LOGO"></a>
			</div>
		</div>
	</div>
<body>
<div id="instruccion">
<h1>Elije, Qué animal era</h1> 
</div>
<div id="forma">
        	<form action="retencion3.php" method="post">
			<input type="image" name="btn4" src="images/retencion/<?php
			if($_SESSION['animal']<6){
				echo $_SESSION['animal'].'.png" width="200px" height="200px" value="1">';
			}else{echo $pos1.'.png" width="200px" height="200px" value="0">';}
			?>
			<input type="image" name="btn5" src="images/retencion/<?php
			if($_SESSION['animal']>5&&$_SESSION['animal']<11){
				echo $_SESSION['animal'].'.png" width="200px" height="200px" value="1">';
			}else{echo $pos2.'.png" width="200px" height="200px" value="0">';}
			?>
            <input type="image" name="btn6" src="images/retencion/<?php
			if($_SESSION['animal']>10){
				echo $_SESSION['animal'].'.png" width="200px" height="200px" value="1">';
			}else{echo $pos3.'.png" width="200px" height="200px" value="0">';}
			?>
  			</form>
</div>
</body>
</html>