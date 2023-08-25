package com.boot.javaPrograms.service.serviceImpl;

import com.boot.javaPrograms.service.Shape;
import org.springframework.stereotype.Service;


@Service
public class ShapeImpl implements Shape {


    @Override
    public void rightTriangle() {
        for(int i=1;i<=7;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void rightTriangleMirrored() {
        for(int i=1;i<=7;i++){
            for(int j=7;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void rightTriangleInverted() {
        for(int i=1;i<=7;i++){
            for(int j=i;j<=7;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void rightTriangleInvertedFlipped() {
        for(int i=1;i<=7;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=7;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void diamond() {
        for(int i=1;i<7;i++){
            for(int j=7;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<7;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int k=7*2;k>(i*2)+1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void square() {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public void rectangle() {
        for(int i=1;i<4;i++){
            for(int j=1;j<7;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
