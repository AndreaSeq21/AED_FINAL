/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.NationalEnterprise;

import Business.Enterprise.Enterprise;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author andrea sequeria
 */

public class FDA extends Enterprise{

    public FDA(String name) {
        super(name, EnterpriseType.FDA);
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
        
    }
    
}
