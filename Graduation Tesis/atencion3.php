<?php
		@$r4=$_POST["btn4"];
		@$r5=$_POST["btn5"];
		@$r6=$_POST["btn6"];
		session_start();
					if(isset($r4)){
							if($r4=="2b"||$r4=="6f"||$r4=="7g"||$r4=="9i"){
								$_SESSION['puntuacion']++;
							}else{ }	
					}	
					else{
				 	if(isset($r5)){
							if($r5=="1a"||$r5=="5e"||$r5=="8h"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					else{
							if($r6=="3c"||$r6=="4d"||$r6=="10d"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					}
	$pos1=rand(1, 20);
	$pos2=rand(1, 20);
	$res3= array(
	    1 => "Conejo",
    	2 => "Oso",
   		3 => "Lagartija",
    	4 => "Ratón",
		5 => "Cerdo",
		6 => "Venado",
		7 => "Oveja",
		8 => "Castor",
		9 => "Iguana",
		10 => "Gato",
		11 => "Perro",
		12 => "Mono",
		13 => "Tigre",
		14 => "León",
		15 => "Caballo",
		16 => "Vaca",
		17 => "Canguro",
		18 => "Cocodrilo",
		19 => "Jirafa",
		20 => "Elefante",
	);
	while($pos1==$pos2){
	$pos2=rand(1, 20);
	}
	$sol=max($pos1,$pos2);
	
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/style.css" type="text/css">
<title>Juegos Atención</title>
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
<h1>¿Elije quién tiene la cola MÁS larga?</h1> 
</div>
		<div id="forma">
        	<form action="resultados.php" method="post">

			<br>		
			<h1><?php echo "$res3[$pos1]";?></h1><input type="image" name="btn7" src="images/botones/1.png" width="70px" height="70px" onMouseOver="this.src='images/botones/a.png'" onMouseOut="this.src='images/botones/1.png'" value="<?php 
			if($res3[$pos1]==$res3[$sol]){
				echo "1";
				}else{}
			?>"> 
            <h1><?php echo "$res3[$pos2]";?></h1><input type="image" name="btn8" src="images/botones/2.png" width="70px" height="70px" onMouseOver="this.src='images/botones/b.png'" onMouseOut="this.src='images/botones/2.png'" value="<?php 
			if($res3[$pos2]==$res3[$sol]){
				echo "1";
				}else{}
			?>"> 
  			</form>
		</div>
</body>
</html>