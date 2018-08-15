<html>
    <head>
    <title>Tu Orden</title>
    </head>
    <body>
    <div class="Especialidades2">
    <?php
        $bd_host = "127.0.0.1";
        
        $bd_user = "root";
        
        $bd_pass = "";
        
        $bd_name = "itacos";
        
        $Nombre=$_POST['Nom'];
        
        $Orden=$_POST['Orde'];
        
        $Cantidad=$_POST['Cantidad'];
        
        $Todo=$_POST['Con'];
        
        $Tomar=$_POST['Tomar'];
        
        $Cantidad_tomar=$_POST['Cuan_tom'];
        
        $Total = ($Cantidad * 12) + ($Cantidad_tomar * 15);
       
        
        $conectar = mysqli_connect($bd_host, $bd_user, $bd_pass, $bd_name);
            if (mysqli_connect_errno())
            {
                printf("ERROR: %u - %s", mysqli_connect_errno(), mysqli_connect_errno());
                exit();
            }
            mysqli_set_charset($conectar, "utf8"); 
        $Venta = "INSERT INTO ventas (producto_venta, Cantidad, Con_Todo, Bebida, Cantidad_Bebida, Nom_Cliente, Total) values ('$Orden','$Cantidad','$Todo','$Tomar','$Cantidad_tomar','$Nombre', '$Total' )";
        
        if ($resultado = mysqli_query($conectar, $Venta))
        {
            printf("<center>Tu pedido ha sido Enviado!</center>");
            echo "<center><br> Estimado {$Nombre} Acabas de ordenar {$Cantidad} {$Orden} con tu bebida {$Tomar}</center>";
            echo "<hr>";
            echo "<center>El Total a pagar {$Nombre} es : {$Total} pesos</center>";
        }
        else
        {
            printf("Ups! ha surgido un problema por favor verifica los datos");
        }
        mysqli_close($conectar);
        ?>
        <a href="iTacos-Ordena.html">
        <img src="Images/OrdenaAhora.png" width="20%" height="20%">
        </a>
        </div>
        <body background="Images/bg_slider.jpg" >
        </body>
    </body>
</html>