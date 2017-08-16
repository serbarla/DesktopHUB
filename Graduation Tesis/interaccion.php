<?php
	$r=rand(1, 10);
	$resp= array('0','0','0');
	if($r==1){
		$resp[0]="c";
		$resp[1]="b";
		$resp[2]="a";
	}else{
		if($r==2){
		$resp[0]="c";
		$resp[1]="b";
		$resp[2]="a";
		}else{
			if($r==3){
			$resp[0]="a";
			$resp[1]="b";
			$resp[2]="c";
			}else{
				if($r==4){
				$resp[0]="c";
				$resp[1]="d";
				$resp[2]="e";
				}else{
				    if($r==5){
					$resp[0]="e";
					$resp[1]="f";
					$resp[2]="g";
					}else{
						if($r==6){
						$resp[0]="e";
						$resp[1]="f";
						$resp[2]="g";
						}else{
							if($r==7){
							$resp[0]="e";
							$resp[1]="f";
							$resp[2]="g";
							}else{
								if($r==8){
								$resp[0]="g";
								$resp[1]="h";
								$resp[2]="i";
								}else{
									if($r==9){
									$resp[0]="i";
									$resp[1]="h";
									$resp[2]="j";
									}else{
										$resp[0]="h";
										$resp[1]="j";
										$resp[2]="i";
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
<title>Juegos Interacción</title>
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
<h1>¿Elije qué Línea se parece MÁS a esta?</h1>
</div>
		<div id="forma">
        	<form action="interaccion2.php" method="post">
			<img src="images/lineasb/<?php echo "$r";?>.png" width="150" height="150">
			<br>		
		   <input type="image" name="btn1" src="images/lineasb/<?php echo "$resp[0]";?>.png" width="150px" height="150px" onMouseOver="this.src='images/lineasb/<?php echo "$resp[0]";?>b.png'" onMouseOut="this.src='images/lineasb/<?php echo "$resp[0]";?>.png'" value="<?php echo "$r$resp[0]";?>"> <br>
           <input type="image" name="btn2" src="images/lineasb/<?php echo "$resp[1]";?>.png" width="150px" height="150px" onMouseOver="this.src='images/lineasb/<?php echo "$resp[1]";?>b.png'" onMouseOut="this.src='images/lineasb/<?php echo "$resp[1]";?>.png'" value="<?php echo "$r$resp[1]";?>"> <br>
           <input type="image" name="btn3" src="images/lineasb/<?php echo "$resp[2]";?>.png" width="150px" height="150px" onMouseOver="this.src='images/lineasb/<?php echo "$resp[2]";?>b.png'" onMouseOut="this.src='images/lineasb/<?php echo "$resp[2]";?>.png'" value="<?php echo "$r$resp[2]";?>"> <br>
  			</form>
		
</div>
</body>
</html>
