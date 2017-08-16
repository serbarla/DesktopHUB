<?php
		@$r1=$_POST["btn1"];
		@$r2=$_POST["btn2"];
		@$r3=$_POST["btn3"];
		session_start();
		$_SESSION['puntuacion'] = 0;


					if(isset($r1)){
							if($r1=="2g"||$r1=="5h"||$r1=="9f"){
								$_SESSION['puntuacion']++;
							}else{ }	
					}	
					else{
				 	if(isset($r2)){
							if($r2=="4g"||$r2=="6b"||$r2=="8d"||$r2=="10c"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					else{
							if($r3=="1d"||$r3=="3f"||$r3=="7f"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					}
	$ra2=rand(1, 10);
	$res2= array('0','0','0');
	if($ra2==1){
		$res2[0]="i";
		$res2[1]="a";
		$res2[2]="e";
	}else{
		if($ra2==2){
		$res2[0]="b";
		$res2[1]="h";
		$res2[2]="f";
		}else{
			if($ra2==3){
			$res2[0]="e";
			$res2[1]="a";
			$res2[2]="c";
			}else{
				if($ra2==4){
				$res2[0]="a";
				$res2[1]="g";
				$res2[2]="d";
				}else{
				    if($ra2==5){
					$res2[0]="h";
					$res2[1]="e";
					$res2[2]="i";
					}else{
						if($ra2==6){
						$res2[0]="f";
						$res2[1]="b";
						$res2[2]="a";
						}else{
							if($ra2==7){
							$res2[0]="g";
							$res2[1]="c";
							$res2[2]="f";
							}else{
								if($ra2==8){
								$res2[0]="a";
								$res2[1]="h";
								$res2[2]="b";
								}else{
									if($ra2==9){
									$res2[0]="i";
									$res2[1]="e";
									$res2[2]="b";
									}else{
										$res2[0]="g";
										$res2[1]="c";
										$res2[2]="d";
									}
								}
							}
						}
					}
				}
			}
		}
	}					
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
<h1>¿Elije el COLOR de estas cosas?</h1>
<img src="images/colores/<?php echo "$ra2";?>.png" width="550" height="100">
</div>
		<div id="forma">
        	<form action="atencion3.php" method="post">
			<br>		
			1.<input type="image" name="btn4" src="images/colores/<?php echo "$res2[0]";?>.png" width="70px" height="70px" onMouseOver="this.src='images/colores/<?php echo "$res2[0]";?>b.png'" onMouseOut="this.src='images/colores/<?php echo "$res2[0]";?>.png'" value="<?php echo "$ra2$res2[0]";?>"> 
            2.<input type="image" name="btn5" src="images/colores/<?php echo "$res2[1]";?>.png" width="70px" height="70px" onMouseOver="this.src='images/colores/<?php echo "$res2[1]";?>b.png'" onMouseOut="this.src='images/colores/<?php echo "$res2[1]";?>.png'" value="<?php echo "$ra2$res2[1]";?>"> 
            3.<input type="image" name="btn6" src="images/colores/<?php echo "$res2[2]";?>.png" width="70px" height="70px" onMouseOver="this.src='images/colores/<?php echo "$res2[2]";?>b.png'" onMouseOut="this.src='images/colores/<?php echo "$res2[2]";?>.png'" value="<?php echo "$ra2$res2[2]";?>">
  			</form>
		</div>
</body>
</html>
