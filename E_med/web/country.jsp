<%@taglib prefix="s" uri="/struts-tags"%>
<s:form action="addCountry">
    <h1>Add Country</h1>
    <s:textfield name="add_country" label="Country" size="15"/>
   
    <s:submit value="submit" label="Add" align="center"/>
    
</s:form>