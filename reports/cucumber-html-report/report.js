$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/functionalTests/JpetTest1.feature");
formatter.feature({
  "line": 2,
  "name": "JpetStore",
  "description": "",
  "id": "jpetstore",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@JpetStore"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Login in the JpetStore",
  "description": "",
  "id": "jpetstore;login-in-the-jpetstore",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TS_01"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user should launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user open the \tHome Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click signout",
  "keyword": "Then "
});
formatter.match({
  "location": "Jpet_Login.the_User_Launch_Browser()"
});
formatter.result({
  "duration": 7330729816,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_Login.the_User_click_signin()"
});
formatter.result({
  "duration": 434547071,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_Login.the_User_enter_login_dtails()"
});
formatter.result({
  "duration": 332305068,
  "error_message": "java.lang.IncompatibleClassChangeError: Found interface org.apache.poi.util.POILogger, but class was expected\r\n\tat org.apache.poi.openxml4j.opc.PackageRelationshipCollection.parseRelationshipsPart(PackageRelationshipCollection.java:304)\r\n\tat org.apache.poi.openxml4j.opc.PackageRelationshipCollection.\u003cinit\u003e(PackageRelationshipCollection.java:156)\r\n\tat org.apache.poi.openxml4j.opc.PackageRelationshipCollection.\u003cinit\u003e(PackageRelationshipCollection.java:124)\r\n\tat org.apache.poi.openxml4j.opc.PackagePart.loadRelationships(PackagePart.java:559)\r\n\tat org.apache.poi.openxml4j.opc.PackagePart.\u003cinit\u003e(PackagePart.java:112)\r\n\tat org.apache.poi.openxml4j.opc.PackagePart.\u003cinit\u003e(PackagePart.java:83)\r\n\tat org.apache.poi.openxml4j.opc.PackagePart.\u003cinit\u003e(PackagePart.java:128)\r\n\tat org.apache.poi.openxml4j.opc.ZipPackagePart.\u003cinit\u003e(ZipPackagePart.java:78)\r\n\tat org.apache.poi.openxml4j.opc.ZipPackage.getPartsImpl(ZipPackage.java:218)\r\n\tat org.apache.poi.openxml4j.opc.OPCPackage.getParts(OPCPackage.java:662)\r\n\tat org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:269)\r\n\tat org.apache.poi.util.PackageHelper.open(PackageHelper.java:39)\r\n\tat org.apache.poi.xssf.usermodel.XSSFWorkbook.\u003cinit\u003e(XSSFWorkbook.java:204)\r\n\tat datapack.Excel_Class.excel_username(Excel_Class.java:15)\r\n\tat jpetpage.SigninPage.send_User1(SigninPage.java:36)\r\n\tat com.JpetStepDefinition.Jpet_Login.the_User_enter_login_dtails(Jpet_Login.java:41)\r\n\tat ✽.Then enter username and password(src/test/resources/functionalTests/JpetTest1.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Jpet_Login.click_signout()"
});
formatter.result({
  "status": "skipped"
});
});