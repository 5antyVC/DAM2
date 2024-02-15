<?php
    include 'act_index.php';
?>

<!DOCTYPE html>
<html>
    <meta http-equiv="cache-control" content="no-cache" />
    <link rel="stylesheet" href="css/style.css"/>
    <?php
        include 'layout/cabecera.php';
    ?>
    <body>
        <div action="container">
            <?php
                include 'layout/dsp_menu.php';
                include $txt_contenido;
            ?>
        </div>
    </body>
    <?php
        include 'layout/pie.php';
    ?>
</html>