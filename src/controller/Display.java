/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jogamp.opengl.GL;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;
import com.jogamp.opengl.glu.GLU;

import javax.swing.JFrame;

/**
 *
 * @author marco
 */
public class Display implements GLEventListener, MouseWheelListener {

    private int tipoOperacao;
    private double coeficienteAngular;
    private double coeficienteLinear;
    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;
    private double multiplicadorM;
    private double termoIndependente;
    private double scaleX;
    private double scaleY;

    public Display() {
        this.tipoOperacao = 0;
        this.scaleX = 1;
        this.scaleY = 1;
    }

    public void setFuncao1grau(double coeficienteAngular, double coeficienteLinear) {
        this.tipoOperacao = 1;
        this.tipoOperacao = tipoOperacao;
        this.coeficienteAngular = coeficienteAngular;
        this.coeficienteLinear = coeficienteLinear;
    }

    public void setFuncao2grau(double coeficienteA, double coeficienteB, double coeficienteC) {
        this.tipoOperacao = 2;
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public void setSeno(double multiplicadorM, double termoIndependente) {
        this.tipoOperacao = 3;
        this.multiplicadorM = multiplicadorM;
        this.termoIndependente = termoIndependente;
    }

    public void setCosseno(double multiplicadorM, double termoIndependente) {
        this.tipoOperacao = 4;
        this.multiplicadorM = multiplicadorM;
        this.termoIndependente = termoIndependente;
    }

    public void showDisplay(String title) {
        //ACELERA O RENDERING
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(profile);
        cap.setHardwareAccelerated(true);

        //CRIA O PAINEL E ADICIONA UM GLEVENTLISTENER
        Display render = this;
        GLCanvas canvas = new GLCanvas(cap);
        canvas.addGLEventListener(render);
        canvas.addMouseWheelListener(render);

        //Cria uma janela e adiciona o painel
        JFrame frame = new JFrame(title);
        frame.getContentPane().add(canvas);
        frame.setSize(800, 800);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //inicializa o sistema e chama a função display a 30fps
        FPSAnimator animator = new FPSAnimator(canvas, 30);
        frame.setVisible(true);
        //frame.addMouseListener(render);
        animator.start();
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        GLU glu = new GLU();
        glu.gluOrtho2D(-1000, 1000, -1000, 1000);
    }

    @Override
    public void dispose(GLAutoDrawable glad) {

    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);

        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();

        GLUT glut = new GLUT();
        gl.glScaled(this.scaleX, this.scaleY, 1);
        this.drawPlanoCartesiano(glut, gl);
        this.draw(glut, gl);
    }

    @Override
    public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {

    }

    public void draw(GLUT glut, GL2 gl) {

        double t;
        gl.glBegin(gl.GL_LINE_STRIP);
        gl.glLineWidth(5);
        gl.glColor3f(1.0f, 0f, 0f);
        if (this.tipoOperacao != 0) {
            for (t = -1000; t <= 1000; t += 0.1) {

                switch (this.tipoOperacao) {
                    case 1:
                        gl.glVertex2d(t, this.coeficienteAngular * t + this.coeficienteLinear);
                        break;
                    case 2:
                        gl.glVertex2d(t, this.coeficienteA * t * t + this.coeficienteB * t + this.coeficienteC);
                        break;

                    case 3:
                        gl.glVertex2d(t, this.multiplicadorM * Math.sin(2 * Math.PI * t) + this.termoIndependente);
                        break;
                    case 4:
                        gl.glVertex2d(t, this.multiplicadorM * Math.cos(2 * Math.PI * t) + this.termoIndependente);
                        break;
                }

            }
        }
        gl.glEnd();
    }

    public void drawPlanoCartesiano(GLUT glut, GL2 gl) {
        gl.glClear(GL.GL_LINES);
        gl.glBegin(GL.GL_LINES);
        gl.glLineWidth(5);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex2f(-10000, 0);
        gl.glVertex2f(10000, 0);
        gl.glVertex2f(0, -10000);
        gl.glVertex2f(0, 10000);
        gl.glEnd();
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println(e);

        switch (e.getWheelRotation()) {
            case 1:
                this.scaleX -= 1;
                this.scaleY -= 1;
                if (this.scaleX == 0) {
                    this.scaleX = 1;
                }
                if (this.scaleY == 0) {
                    this.scaleY = 1;
                }
                break;
            case -1:
                this.scaleX += 1;
                this.scaleY += 1;
                break;
        }
    }

}
