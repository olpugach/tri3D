/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class JavaFXApplication11 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        // коробка с размерами сторон 100, 100, 100
        Box box = new Box(100, 100, 100);
        box.setTranslateX(150);
        box.setTranslateY(0);
        box.setTranslateZ(400);
        // сфера с радиусом 50
        Sphere sphere = new Sphere(50);
        sphere.setTranslateX(300);
        sphere.setTranslateY(-5);
        sphere.setTranslateZ(400);

        // цилиндр радиусом 40 и высотой 120
        Cylinder cylinder = new Cylinder(40, 120);
        cylinder.setTranslateX(500);
        cylinder.setTranslateY(-25);
        cylinder.setTranslateZ(600);

        // Создание точки освещения
        PointLight light = new PointLight();
        light.setTranslateX(350);
        light.setTranslateY(100);
        light.setTranslateZ(300);

        // Добавление фигур и освещения
        Group root = new Group(box, sphere, cylinder, light);

        // Создание сцены с поддержкой буфера глубины
        Scene scene = new Scene(root, 500, 300, true);

        // Установка камеры для обзора трехмерных фигур
        PerspectiveCamera camera = new PerspectiveCamera(false);// создание камеры
        camera.setTranslateX(100);
        camera.setTranslateY(-50);
        camera.setTranslateZ(300);
        scene.setCamera(camera);

        stage.setScene(scene);
        stage.setTitle("Отрисовка трехмерных фигур");
        stage.show();
    }
}