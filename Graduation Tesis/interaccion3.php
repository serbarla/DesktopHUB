<?php
		@$r4=$_POST["btn4"];
		@$r5=$_POST["btn5"];
		@$r6=$_POST["btn6"];
		session_start();
					if(isset($r4)){
							if($r4=="1"){
								$_SESSION['puntuacion']++;
							}else{ }	
					}	
					else{
				 	if(isset($r5)){
							if($r5=="1"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					else{
							if($r6=="1"){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					}
		$angul=array("90","180","270");	
		$rand=rand(0, 2);	
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
<h1>¿Elije qué imagen es igual?</h1> 

</div>
		<div id="forma">
        <?php

$original = imagecreatefrompng("images/figur/".$rand2.".png");
$compass = imagerotate($original, $angul[$rand], 0xFFE05D);

ob_start();
imagepng($compass);
$stringdata = ob_get_contents(); 
ob_end_clean(); 

$imageData = base64_encode($stringdata);
$src = 'data: image/png;base64,'.$imageData;
echo '<img src="',$src,'">';
?>
        	<form action="resultados.php" method="post">
			<br>		
			1.<input type="image" name="btn7" src="images/figur/
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
      
      
            
            
            2.<input type="image" name="btn8" src="images/figur/
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
            
            3.<input type="image" name="btn9" src="images/figur/
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