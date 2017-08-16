<?php
		@$r4=$_POST["btn4"];
		@$r5=$_POST["btn5"];
		@$r6=$_POST["btn6"];
		session_start();
					if(isset($r4)){
							if($r4==1){
								$_SESSION['puntuacion']++;
							}else{ }	
					}	
					else{
				 	if(isset($r5)){
							if($r5==1){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					else{
							if($r6==1){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					}
					$anml=rand(1, 10);
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
<meta http-equiv="refresh" content="10;url=retresp3.php">
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
<h1>¡Espéra!, Escucha a este Animal, tienes <span id="countdown">10</span> segundos</h1>
</div>
		<div style="visibility:hidden">
        	<h1><?php echo "<audio controls autoplay>  <source src='sonido/".$res3[$anml].".wav' type='audio/wav' loop=true> </audio>";
			$_SESSION['animal']=$anml;?></h1>
		</div>
</body>
</html>

<script type="text/javascript">

(function () {
    var timeLeft = 10,
        cinterval;

    var timeDec = function (){
        timeLeft--;
        document.getElementById('countdown').innerHTML = timeLeft;
        if(timeLeft === 0){
            clearInterval(cinterval);
        }
    };

    cinterval = setInterval(timeDec, 1000);
})();

</script>
