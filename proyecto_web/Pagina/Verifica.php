<!DOOCTYPE html>
<html>
<head>
    <title></title>
    </head>
    <body>
        <?php
        try
        {
            $conMySQL = new PDO("mysql:host=localhost; dbname=itacos", "root", "");
            
            $conMySQL->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            
            $sentenciaSQL = "select * from usuarios where nombre_usuario = :login and passwd =:passw";
            
            $sentenciaPrep = $conMySQL->prepare($sentenciaSQL);
            
            $log=htmlspecialchars(addslashes($_POST["user"]));
            
            $pas=htmlspecialchars(addslashes($_POST["contra"]));
            
            
            $sentenciaPrep->execute(array(":login"=>$log, ":passw"=>$pas));
            
            $numRegistros = $sentenciaPrep->rowCount();
            
            if ($numRegistros !=0)
            {
                session_start();
                $_SESSION["nombre_usuario"]=$_POST["user"];
                header("Location:Admin/Sesion.php");
            }
            else
            {
                header("Location:Login.html");
            }
        }
        catch(Exception $e)
        {
            die("Error: " . $e->getMessage());
        }
        finally{    $conMySQL = null;   }
        ?>
        </body>
</html>