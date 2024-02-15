<?php
    include 'act_menu.php';
?>
<div action="sidebar">
    <h2>Menú Principal</h2>
    <a href="http://localhost/ejemplo1/?action=0">
        <?php
            echo $txt_menu_inicio;
        ?>
    </a>
    <a href="http://localhost/ejemplo1/?action=1">
        <?php
            echo $txt_menu_alumnos;
        ?>
    </a>
    <a href="http://localhost/ejemplo1/?action=2">
        <?php
            echo $txt_menu_profesores;
        ?>
    </a>
    <a href="http://localhost/ejemplo1/?action=3">
        <?php
            echo $txt_menu_aulas;
        ?>
    </a>
    <a href="http://localhost/ejemplo1/?action=4">
        <?php
            echo $txt_menu_asignaturas;
        ?>
    </a>
</div>

