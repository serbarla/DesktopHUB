<?php
	$pos1=rand(1, 5);
	$pos2=rand(6, 10);
	session_start();
	$_SESSION['animal'];
		
		$res3= array(
	    1 => "a",
    	2 => "b",
   		3 => "c",
    	4 => "d",
		5 => "e",
		6 => "f",
		7 => "g",
		8 => "h",
		9 => "i",
		10 => "j",
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
        	<form action="resultados.php" method="post">
			<input type="image" name="btn7" src="images/retencion/<?php
			if($_SESSION['animal']<6){
				echo $res3[$_SESSION['animal']].'.png" width="200px" height="200px" value="1">';
			}else{echo $res3[$pos1].'.png" width="200px" height="200px" value="0">';}
			?>
			<input type="image" name="btn8" src="images/retencion/<?php
			if($_SESSION['animal']>5){
				echo $res3[$_SESSION['animal']].'.png" width="200px" height="200px" value="1">';
			}else{echo $res3[$pos2].'.png" width="200px" height="200px" value="0">';}
			?>
  			</form>
</div>
</body>
</html>