package com.teammates.studentgrademanager.rest;

import com.teammates.studentgrademanager.model.AdminData;
import com.teammates.studentgrademanager.model.StudentData;
import com.teammates.studentgrademanager.service.AdminServiceFacadeImpl;
import com.teammates.studentgrademanager.service.IAdminServiceFacade;
import com.teammates.studentgrademanager.service.IStudentServiceFacade;
import com.teammates.studentgrademanager.service.StudentServiceFacadeImpl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

@Path("v1/studentdetails/*")
public class V1_StudentDetails {
    public V1_StudentDetails() {
        super();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response returnStudentInfo() throws Exception {

        String returnString = null;

        JSONArray jsonArray = new JSONArray();

        IStudentServiceFacade facade = new StudentServiceFacadeImpl();
        List<StudentData> list = facade.getStudentDetails();
        for (StudentData s : list) {
            JSONObject jsonobj = new JSONObject();
            jsonobj.put("FirstName", s.getFirstname());
            jsonobj.put("LastName", s.getLastname());
            jsonobj.put("Gender", s.getStudentGender());
            jsonobj.put("CollegeID", s.getCollegeID());
            jsonobj.put("Email", s.getStudentEmail());
            jsonobj.put("Branch", s.getStudentBranch());
            jsonobj.put("AddressLine1", s.getAddressLine1());
            jsonobj.put("AddressLine2", s.getAddressLine1());
            jsonobj.put("City", s.getCity());
            jsonobj.put("State", s.getState());
            jsonobj.put("Pincode", s.getPincode());
            jsonobj.put("Phone", s.getStudentPhone());
            jsonobj.put("PercentMarks", s.getStudentPercentMarks());
            jsonobj.put("Password", s.getStudentPassword());

            jsonArray.put(jsonobj);
        }

        try {
            returnString = jsonArray.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(500).entity("Server was not able to process your request").build();
        }

        return Response.ok(returnString).build();
    }

    @Path("/deletebyid/{collegeid}")
    @DELETE
    @Consumes( { MediaType.APPLICATION_FORM_URLENCODED })
    public Response deleteItem(@PathParam("collegeid")
        String collegeid) throws Exception {

        System.out.println(collegeid);
        String returnString = "Cannot delete student";
        try {
            IStudentServiceFacade facade = new StudentServiceFacadeImpl();
            facade.deleteRecord(collegeid);
            returnString = "Record deleted successfully";

        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(500).entity("Server was not able to process your request").build();
        }

        return Response.ok(returnString).build();
    }

    @Path("/registeradmin")
    @POST
    public Response registerAdminRest(String incomingData) throws Exception {

        String returnString = null;
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        System.out.println(incomingData);

        try {

            JSONObject registerData = new JSONObject(incomingData);
            System.out.println("jsonData: " + registerData.toString());

            AdminData adminData = new AdminData();
            adminData.setUsername(registerData.optString("adminusername"));
            adminData.setPassword(registerData.optString("adminpassword"));
            
            IAdminServiceFacade facade = new AdminServiceFacadeImpl();
            boolean result = facade.register(adminData);
            
            if(result==true) {
                return Response.ok(returnString).build();
            }
            else {
                return Response.status(500).entity("Unable to enter Item").build();
            }

    }
        catch(Exception e) {
            e.printStackTrace();
            return Response.status(500).entity("Unable to enter Item").build();
        }
        
    }
}
