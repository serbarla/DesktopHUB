<?php
		@$r1=$_POST["btn1"];
		@$r2=$_POST["btn2"];
		@$r3=$_POST["btn3"];
		session_start();
		$_SESSION['puntuacion'] = 0;


					if(isset($r1)){
							if($r1=="2b"||$r1=="5e"||$r1=="9i"){
								$_SESSION['puntuacion']++;
							}else{ }	
					}	
					else{
				 	if(isset($r2)){
							if($r2=="4d"||$r2=="6f"||$r2=="8h"||$r2=="10j"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					else{
							if($r3=="1a"||$r3=="3c"||$r3=="7g"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					}
		$angul=array("45","90","135","180","225","270","315");	
		$rand=rand(0, 6);	
		$rand2=rand(1, 10);
		$randb1=rand(1,3);
		$randb2=rand(4,6);
		$randb3=rand(7,10);
		$randp=rand(1,3);

		
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
<h1>¿Elije qué Letra se parece MÁS a esta?</h1>

</div>
		<div id="forma">
        <?php

$original = imagecreatefrompng("images/letrasb/".$rand2.".png");
$compass = imagerotate($original, $angul[$rand], 0xFFE05D);

ob_start();
imagepng($compass);
$stringdata = ob_get_contents(); 
ob_end_clean(); 

$imageData = base64_encode($stringdata);
$src = 'data: image/png;base64,'.$imageData;
echo '<img src="',$src,'">';
?>
        	<form action="interaccion3.php" method="post">
			<br>		
			1.<input type="image" name="btn4" src="images/letrasb/
			<?php  
			if($randp==1){
			echo $rand2.'.png" width="70px" height="70px" value="1">';	
			}else{
				if($randb1<>$rand2){
					echo $randb1.'.png" width="70px" height="70px" value="0">';
					}else{ 
					echo $randb2-$randb1.'.png" width="70px" height="70px" value="0">';
					}
			}		
			?> 
      
      
            
            
            2.<input type="image" name="btn5" src="images/letrasb/
			<?php 
			if($randp==2){
			echo $rand2.'.png" width="70px" height="70px"  value="1">';		
			}else{
				if($randb2<>$rand2){
					echo $randb2.'.png" width="70px" height="70px"  value="0">';
					}else{ 
					echo $randb3-$randb2.'.png" width="70px" height="70px"  value="0">';
					}
			}	
			?>            
            
            3.<input type="image" name="btn6" src="images/letrasb/
			<?php 
			if($randp==3){
			echo $rand2.'.png" width="70px" height="70px"  value="1">';		
			}else{
				if($randb3<>$rand2){
					echo $randb3.'.png" width="70px" height="70px"  value="0">';
					}else{ 
					echo 11-$randb3.'.png" width="70px" height="70px"  value="0">';
					}
			}			
			?>
  			</form>
		</div>
</body>
</html>
