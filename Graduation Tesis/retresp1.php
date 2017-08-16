<?php

	$pos1=rand(1, 5);
	$pos2=rand(6, 10);
	$pos3=rand(11, 15);
	session_start();
	$_SESSION['animal'];
	$res3= array(
	    1 => "Elefante",
    	2 => "Jirafa",
   		3 => "Lagartija",
    	4 => "Cocodrilo",
		5 => "Delfin",
		6 => "Venado",
		7 => "León",
		8 => "Canguro",
		9 => "Serpiente",
		10 => "Vaca",
		11 => "Perro",
		12 => "Oso",
		13 => "Tiburón",
		14 => "Rinoceronte",
		15 => "Araña",

	);
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
        	<form action="retencion2.php" method="post">
			<h1><input type="submit" name="btn1" value="<?php
			if($_SESSION['animal']<6){
				echo $res3[$_SESSION['animal']];
			}else{echo $res3[$pos1];}
			?>"/>
			<input type="submit" name="btn2" value="<?php
			if($_SESSION['animal']>5&&$_SESSION['animal']<11){
				echo $res3[$_SESSION['animal']];
			}else{echo $res3[$pos2];}
			?>"/>
            <input type="submit" name="btn3" value="<?php
			if($_SESSION['animal']>10){
				echo $res3[$_SESSION['animal']];
			}else{echo $res3[$pos3];}
			?>"/></h1> 
  			</form>
</div>
</body>
</html>