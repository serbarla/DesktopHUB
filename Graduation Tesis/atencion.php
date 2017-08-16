<?php
	$r=rand(1, 10);
	$resp= array('0','0','0');
	if($r==1){
		$resp[0]="a";
		$resp[1]="b";
		$resp[2]="d";
	}else{
		if($r==2){
		$resp[0]="g";
		$resp[1]="b";
		$resp[2]="d";
		}else{
			if($r==3){
			$resp[0]="a";
			$resp[1]="d";
			$resp[2]="f";
			}else{
				if($r==4){
				$resp[0]="d";
				$resp[1]="g";
				$resp[2]="f";
				}else{
				    if($r==5){
					$resp[0]="h";
					$resp[1]="a";
					$resp[2]="c";
					}else{
						if($r==6){
						$resp[0]="d";
						$resp[1]="b";
						$resp[2]="a";
						}else{
							if($r==7){
							$resp[0]="h";
							$resp[1]="c";
							$resp[2]="f";
							}else{
								if($r==8){
								$resp[0]="a";
								$resp[1]="d";
								$resp[2]="b";
								}else{
									if($r==9){
									$resp[0]="f";
									$resp[1]="e";
									$resp[2]="b";
									}else{
										$resp[0]="b";
										$resp[1]="c";
										$resp[2]="f";
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
<h1>¿Elije qué Figura NO aparece en la imagen?</h1>
</div>
		<div id="forma">
        	<form action="atencion2.php" method="post">
			<img src="images/superposicion/<?php echo "$r";?>.png" width="250" height="250">
			<br>		
			1.<input type="image" name="btn1" src="images/superposicion/<?php echo "$resp[0]";?>.png" width="70px" height="70px" onMouseOver="this.src='images/superposicion/<?php echo "$resp[0]";?>b.png'" onMouseOut="this.src='images/superposicion/<?php echo "$resp[0]";?>.png'" value="<?php echo "$r$resp[0]";?>"> 
            2.<input type="image" name="btn2" src="images/superposicion/<?php echo "$resp[1]";?>.png" width="70px" height="70px" onMouseOver="this.src='images/superposicion/<?php echo "$resp[1]";?>b.png'" onMouseOut="this.src='images/superposicion/<?php echo "$resp[1]";?>.png'" value="<?php echo "$r$resp[1]";?>"> 
            3.<input type="image" name="btn3" src="images/superposicion/<?php echo "$resp[2]";?>.png" width="70px" height="70px" onMouseOver="this.src='images/superposicion/<?php echo "$resp[2]";?>b.png'" onMouseOut="this.src='images/superposicion/<?php echo "$resp[2]";?>.png'" value="<?php echo "$r$resp[2]";?>">
  			</form>
		</div>

</body>
</html>
