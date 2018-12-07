/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author marco
 */
public class Display implements GLEventListener, KeyListener {
    int tipoOperacao;
    double coeficienteAngular;
    double coeficienteLinear;
    public Display() {
        this.tipoOperacao = 1;
    }

    public static void main(String args[]) {
        //ACELERA O RENDERING
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(profile);
        cap.setHardwareAccelerated(true);

        //CRIA O PAINEL E ADICIONA UM GLEVENTLISTENER
        Display render = new Display();
        GLCanvas canvas = new GLCanvas(cap);
        canvas.addGLEventListener(render);

        //Cria uma janela e adiciona o painel
        JFrame frame = new JFrame("Laboratório I - Esferas");
        frame.getContentPane().add(canvas);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //inicializa o sistema e chama a função display a 30fps
        FPSAnimator animator = new FPSAnimator(canvas, 30);
        frame.setVisible(true);
        frame.addKeyListener(render);
        animator.start();
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
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
        this.draw(glut, gl);
    }

    @Override
    public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
    public void draw(GLUT glut, GL2 gl) {

        double t;
        gl.glBegin(gl.GL_LINE_STRIP);
        if(this.tipoOperacao != 0){
            for (t = -1; t <= 1; t += 0.0000001) {
                   gl.glVertex2d(t, t*t);
            }
        }
        gl.glEnd();
    }
    
    public GLJPanel panel() {
        GLProfile profile = GLProfile.get(GLProfile.GL2);

        GLCapabilities capabilities = new GLCapabilities(profile);

        GLJPanel panel = new GLJPanel(capabilities);
        panel.addGLEventListener(new Display());
        
        return panel;
    }
    
    public void setEquacao1Grau(double coeficienteLinear, double coeficienteAngular){
        this.coeficienteAngular = coeficienteAngular;
        this.coeficienteLinear = coeficienteLinear;
        this.tipoOperacao = 1;
    }
    
    
}
