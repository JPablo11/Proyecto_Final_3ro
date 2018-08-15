<!DOCTYPE html>
<html>
    <head>
    <title>Elimina registros</title>
    </head>
    <body>
    <?php
        $bd_host = "127.0.0.1";
        
        $bd_user = "root";
        
        $bd_pass = "";
        
        $bd_name = "itacos";
        
        $nombre  = htmlspecialchars($_POST['nombre']);
        
        
        $conectar = mysqli_connect($bd_host, $bd_user, $bd_pass, $bd_name);
            if (mysqli_connect_errno())
            {
                printf("ERROR: %u - %s", mysqli_connect_errno(), mysqli_connect_errno());
                exit();
            }
            mysqli_set_charset($conectar, "utf8"); 
        $actualizar = "DELETE FROM productos WHERE nombre_produ = '$nombre'";
        if ($resultado = mysqli_query($conectar, $actualizar))
        {
            if (mysqli_affected_rows($conectar) == 0)
            {
                printf("El nombre proporcionado no existe");
    
            }
            else
            {
                printf("se ha(n) eliminado %u registro(s)", mysqli_affected_rows($conectar));
            }
        
        }
        else
        {
            printf("ERROR - al conectar con la base");
        }
        mysqli_close($conectar);
        ?>
         <center><a href="Sesion.php">
        <img src="Images/Inicio.png" width="20%" height="20%">
        </a>
        </center>
        <body background="Images/bg_slider.jpg" >
        </body>
    </body>
</html>