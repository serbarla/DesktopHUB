<?php
		@$r1=$_POST["btn1"];
		@$r2=$_POST["btn2"];
		@$r3=$_POST["btn3"];
		session_start();
									
		$anml=rand(1, 15);
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
	
		$_SESSION['puntuacion'] = 0;


					if(isset($r1)){
							if($r1==$res3[$_SESSION['animal']]){
								$_SESSION['puntuacion']++;
							}else{ }	
					}	
					else{
				 	if(isset($r2)){
							if($r2==$res3[$_SESSION['animal']]){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					else{
							if($r3==$res3[$_SESSION['animal']]){
								$_SESSION['puntuacion']++;
							}else{ }
					}	
					}
			
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="refresh" content="10;url=retresp2.php">
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
<h1>¡Espéra!, Recuerda a este Animal, tienes <span id="countdown">10</span> segundos:</h1>
</div>
		<div id="forma">
        	<h1><?php echo $res3[$anml]; 
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