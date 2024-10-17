
package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.SystemView;


public class SettingsController implements MouseListener{
    
    private SystemView views;

    public SettingsController(SystemView views) {
        this.views = views;
        this.views.JLabelProducts.addMouseListener(this);
        this.views.JLabelCategories.addMouseListener(this);
        this.views.JLabelCustomer.addMouseListener(this);
        this.views.JLabelEmployes.addMouseListener(this);
        this.views.JLabelPurchases.addMouseListener(this);
        this.views.JLabelReports.addMouseListener(this);
        this.views.JLabelSuppliers.addMouseListener(this);
        this.views.JLabelSettings.addMouseListener(this);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == views.JLabelProducts){
            views.jPanelProducts.setBackground(new Color(152,202,63));
        }
        else if (e.getSource() == views.JLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(152,202,63));
        }
        else if (e.getSource() == views.JLabelCategories){
            views.jPanelCategories.setBackground(new Color(152,202,63));
        }
        else if (e.getSource () == views.JLabelCustomer){
            views.jPanelCustomer.setBackground(new Color(152,202,63));
        }
        else if (e.getSource() == views.JLabelEmployes){
            views.jPanelEmployes.setBackground(new Color(152,202,63));
        }
        else if (e.getSource() == views.JLabelReports){
            views.jPanelReports.setBackground(new Color(152,202,63));
        }
        else if(e.getSource() == views.JLabelSettings){
            views.jPanelSettings.setBackground(new Color(152,202,63));
        }
        else if (e.getSource() == views.JLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(152,202,63));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == views.JLabelProducts){
            views.jPanelProducts.setBackground(new Color(18,45,61));
        }
        else if (e.getSource() == views.JLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(18,45,61));
        }
        else if (e.getSource() == views.JLabelCategories){
            views.jPanelCategories.setBackground(new Color(18,45,61));
        }
        else if (e.getSource () == views.JLabelCustomer){
            views.jPanelCustomer.setBackground(new Color(18,45,61));
        }
        else if (e.getSource() == views.JLabelEmployes){
            views.jPanelEmployes.setBackground(new Color(18,45,61));
        }
        else if (e.getSource() == views.JLabelReports){
            views.jPanelReports.setBackground(new Color(18,45,61));
        }
        else if(e.getSource() == views.JLabelSettings){
            views.jPanelSettings.setBackground(new Color(18,45,61));
        }
        else if (e.getSource() == views.JLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(18,45,61));
        }
    }
    
    
    
    
}
