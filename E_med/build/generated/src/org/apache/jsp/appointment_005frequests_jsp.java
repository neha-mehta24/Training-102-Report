package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class appointment_005frequests_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/a_header.jsp");
    _jspx_dependants.add("/a_slider.jsp");
    _jspx_dependants.add("/a_footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_id_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_href;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_url_id_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_a_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_url_id_action_nobody.release();
    _jspx_tagPool_s_a_href.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("<body>\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <header>\n");
      out.write("      <div id=\"logo\">\n");
      out.write("     \n");
      out.write("      \n");
      out.write("     <div id=\"logo_text\">\n");
      out.write("          \n");
      out.write("         <h1 align=\"center\">ADMIN HOME</h1>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <nav>\n");
      out.write("        <ul class=\"sf-menu\" id=\"nav\">\n");
      out.write("         \n");
      out.write("          <li>");
      if (_jspx_meth_s_a_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("              <ul>\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_1(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("   ");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_2(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("        ");
      if (_jspx_meth_s_url_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <li>");
      if (_jspx_meth_s_a_3(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("</ul></li>\n");
      out.write("       <li>");
      if (_jspx_meth_s_a_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("         <ul>\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_5(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("   ");
      if (_jspx_meth_s_url_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_6(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("        ");
      if (_jspx_meth_s_url_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <li>");
      if (_jspx_meth_s_a_7(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("</ul> \n");
      out.write("       </li>\n");
      out.write("       <li>");
      if (_jspx_meth_s_a_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("       <ul>\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_9(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("   ");
      if (_jspx_meth_s_url_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_10(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("        ");
      if (_jspx_meth_s_url_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <li>");
      if (_jspx_meth_s_a_11(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("       </li>\n");
      out.write("        <li> ");
      if (_jspx_meth_s_a_12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("       <ul>\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_13(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("   ");
      if (_jspx_meth_s_url_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_14(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("        ");
      if (_jspx_meth_s_url_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <li>");
      if (_jspx_meth_s_a_15(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("        </li>\n");
      out.write("               <li>");
      if (_jspx_meth_s_a_16(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <ul>\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_17(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("   ");
      if (_jspx_meth_s_url_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_18(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("        ");
      if (_jspx_meth_s_url_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <li>");
      if (_jspx_meth_s_a_19(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("               </li>\n");
      out.write("         <li>");
      if (_jspx_meth_s_a_20(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <ul>\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_21(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("   ");
      if (_jspx_meth_s_url_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <li>");
      if (_jspx_meth_s_a_22(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("        ");
      if (_jspx_meth_s_url_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <li>");
      if (_jspx_meth_s_a_23(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("</ul>      \n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("            \n");
      out.write("          <li><a href=\"#\">Settings</a>\n");
      out.write("              <ul>\n");
      out.write("                   \n");
      out.write("         <li>");
      if (_jspx_meth_s_a_24(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("         <li>");
      if (_jspx_meth_s_a_25(_jspx_page_context))
        return;
      out.write("</li> </ul></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.easing-sooper.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.sooperfish.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/image_fade.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      $('ul.sf-menu').sooperfish();\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("    ");
      out.write('\n');
      out.write(' ');
      out.write("<div id=\"site_content\">\n");
      out.write("      <div class=\"gallery\">\n");
      out.write("        <ul class=\"images\">\n");
      out.write("         <li class=\"show\"><img width=\"1050\" height=\"300\" src=\"images/4.jpg\" alt=\"photo_four\" /></li>\n");
      out.write("         <li><img width=\"1050\" height=\"300\" src=\"images/5.jpg\" alt=\"photo_five\" /></li>\n");
      out.write("          <li><img width=\"1050\" height=\"300\" src=\"images/1.jpg\" alt=\"photo_one\" /></li>\n");
      out.write("          <li><img width=\"1050\" height=\"300\" src=\"images/2.jpg\" alt=\"photo_two\" /></li>\n");
      out.write("          <li><img width=\"1050\" height=\"300\" src=\"images/3.jpg\" alt=\"photo_three\" /></li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <li><img width=\"1050\" height=\"300\" src=\"images/7.jpg\" alt=\"photo_six\" /></li>\n");
      out.write("           <li><img width=\"1050\" height=\"300\" src=\"images/6.jpg\" alt=\"photo_even\" /></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("     \n");
      out.write("     <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.easing-sooper.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.sooperfish.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/image_fade.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      $('ul.sf-menu').sooperfish();\n");
      out.write("    });\n");
      out.write("  </script>");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\" />\n");
      out.write("  \n");
      out.write("<div class=\"content2\">\n");
      out.write("    <center><h2> Appointment Requests</h2></center>\n");
      out.write("    <table align=\"center\" border=\"2\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Patient id <th>Disease<th>Medicine taken<th>Doctor prefered<th>Suit Date<th>Apply\n");
      out.write("        \n");
      out.write("      ");

        mypack.conn c1 = new mypack.conn();
        ResultSet rs = c1.execute("select * from patient_medicine_disease");
        while(rs.next())
        {
            
        String pid = rs.getString("patient_id");



      out.write("      \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(pid);
      out.write("</td><td>");
      out.print(rs.getString("disease"));
      out.write("\n");
      out.write("            <td>");
      out.print(rs.getString("Medicine"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("doctorname"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("suit_date"));
      out.write("</td>\n");
      out.write("            <td><a href=\"apply.action?pid=");
      out.print(pid);
      out.write("\">Apply</a></td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("              ");
 }  
      out.write("\n");
      out.write("                \n");
      out.write("    </table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
      out.write("<footer> <p><a href=\"admin_home.jsp\">Home</a>&nbsp;<a href=\"Contactus.jsp\">Contact Us</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("      Copyright &copy; SevenHills Hospital. All rights reserved.| <a href=\"disclaimer.html\">Disclaimer</a></p>\n");
      out.write("      <div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t<div style=\"text-align: center\"><a href=\"http://www.facebook.com\" rel=\"nofollow\"><img src=\"images/facebook.png\" alt=\"Like us on Facebook\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"http://www.twitter.com\"><img src=\"images/twitter.png\" alt=\"Follow us on Twitter\"></a>\n");
      out.write("                        <a href=\"http://www.googleplus.com\"><img src=\"images/gplus.png\" alt=\"Follow us on Google Plus\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"http://www.rss.com\"><img src=\"images/rss.png\" alt=\"RSS feeds\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t  </div>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("  <p>&nbsp;</p>\n");
      out.write("  <!-- javascript at the bottom for fast page loading -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.easing-sooper.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.sooperfish.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/image_fade.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      $('ul.sf-menu').sooperfish();\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_a_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent(null);
    _jspx_th_s_a_0.setHref("#");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("Doctors");
        int evalDoAfterBody = _jspx_th_s_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
    return false;
  }

  private boolean _jspx_meth_s_a_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_1.setPageContext(_jspx_page_context);
    _jspx_th_s_a_1.setParent(null);
    _jspx_th_s_a_1.setHref("doctor_master.jsp");
    int _jspx_eval_s_a_1 = _jspx_th_s_a_1.doStartTag();
    if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_1.doInitBody();
      }
      do {
        out.write("Add Doctor Details");
        int evalDoAfterBody = _jspx_th_s_a_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_1);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_1);
    return false;
  }

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setId("deleteurl");
    _jspx_th_s_url_0.setAction("deldoctor");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_s_a_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_2 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_2.setPageContext(_jspx_page_context);
    _jspx_th_s_a_2.setParent(null);
    _jspx_th_s_a_2.setHref("%{deleteurl}");
    int _jspx_eval_s_a_2 = _jspx_th_s_a_2.doStartTag();
    if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_2.doInitBody();
      }
      do {
        out.write("Delete Doctor Details");
        int evalDoAfterBody = _jspx_th_s_a_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_2);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_2);
    return false;
  }

  private boolean _jspx_meth_s_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_1 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_1.setPageContext(_jspx_page_context);
    _jspx_th_s_url_1.setParent(null);
    _jspx_th_s_url_1.setId("modifyurl");
    _jspx_th_s_url_1.setAction("moddoctor");
    int _jspx_eval_s_url_1 = _jspx_th_s_url_1.doStartTag();
    if (_jspx_th_s_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_1);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_1);
    return false;
  }

  private boolean _jspx_meth_s_a_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_3 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_3.setPageContext(_jspx_page_context);
    _jspx_th_s_a_3.setParent(null);
    _jspx_th_s_a_3.setHref("%{modifyurl}");
    int _jspx_eval_s_a_3 = _jspx_th_s_a_3.doStartTag();
    if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_3.doInitBody();
      }
      do {
        out.write(" Edit Doctor Details");
        int evalDoAfterBody = _jspx_th_s_a_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_3);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_3);
    return false;
  }

  private boolean _jspx_meth_s_a_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_4 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_4.setPageContext(_jspx_page_context);
    _jspx_th_s_a_4.setParent(null);
    _jspx_th_s_a_4.setHref("#");
    int _jspx_eval_s_a_4 = _jspx_th_s_a_4.doStartTag();
    if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_4.doInitBody();
      }
      do {
        out.write("Diseases");
        int evalDoAfterBody = _jspx_th_s_a_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_4);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_4);
    return false;
  }

  private boolean _jspx_meth_s_a_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_5 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_5.setPageContext(_jspx_page_context);
    _jspx_th_s_a_5.setParent(null);
    _jspx_th_s_a_5.setHref("disease_master.jsp");
    int _jspx_eval_s_a_5 = _jspx_th_s_a_5.doStartTag();
    if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_5.doInitBody();
      }
      do {
        out.write("Add Disease Details");
        int evalDoAfterBody = _jspx_th_s_a_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_5);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_5);
    return false;
  }

  private boolean _jspx_meth_s_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_2 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_2.setPageContext(_jspx_page_context);
    _jspx_th_s_url_2.setParent(null);
    _jspx_th_s_url_2.setId("deleteurl");
    _jspx_th_s_url_2.setAction("deldisease");
    int _jspx_eval_s_url_2 = _jspx_th_s_url_2.doStartTag();
    if (_jspx_th_s_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_2);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_2);
    return false;
  }

  private boolean _jspx_meth_s_a_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_6 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_6.setPageContext(_jspx_page_context);
    _jspx_th_s_a_6.setParent(null);
    _jspx_th_s_a_6.setHref("%{deleteurl}");
    int _jspx_eval_s_a_6 = _jspx_th_s_a_6.doStartTag();
    if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_6.doInitBody();
      }
      do {
        out.write("Delete Disease Details");
        int evalDoAfterBody = _jspx_th_s_a_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_6);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_6);
    return false;
  }

  private boolean _jspx_meth_s_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_3 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_3.setPageContext(_jspx_page_context);
    _jspx_th_s_url_3.setParent(null);
    _jspx_th_s_url_3.setId("modifyurl");
    _jspx_th_s_url_3.setAction("moddisease");
    int _jspx_eval_s_url_3 = _jspx_th_s_url_3.doStartTag();
    if (_jspx_th_s_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_3);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_3);
    return false;
  }

  private boolean _jspx_meth_s_a_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_7 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_7.setPageContext(_jspx_page_context);
    _jspx_th_s_a_7.setParent(null);
    _jspx_th_s_a_7.setHref("%{modifyurl}");
    int _jspx_eval_s_a_7 = _jspx_th_s_a_7.doStartTag();
    if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_7.doInitBody();
      }
      do {
        out.write(" Edit Disease Details");
        int evalDoAfterBody = _jspx_th_s_a_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_7);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_7);
    return false;
  }

  private boolean _jspx_meth_s_a_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_8 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_8.setPageContext(_jspx_page_context);
    _jspx_th_s_a_8.setParent(null);
    _jspx_th_s_a_8.setHref("#");
    int _jspx_eval_s_a_8 = _jspx_th_s_a_8.doStartTag();
    if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_8.doInitBody();
      }
      do {
        out.write("Patients");
        int evalDoAfterBody = _jspx_th_s_a_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_8);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_8);
    return false;
  }

  private boolean _jspx_meth_s_a_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_9 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_9.setPageContext(_jspx_page_context);
    _jspx_th_s_a_9.setParent(null);
    _jspx_th_s_a_9.setHref("patient_master.jsp");
    int _jspx_eval_s_a_9 = _jspx_th_s_a_9.doStartTag();
    if (_jspx_eval_s_a_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_9.doInitBody();
      }
      do {
        out.write("Add Patient Details");
        int evalDoAfterBody = _jspx_th_s_a_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_9);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_9);
    return false;
  }

  private boolean _jspx_meth_s_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_4 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_4.setPageContext(_jspx_page_context);
    _jspx_th_s_url_4.setParent(null);
    _jspx_th_s_url_4.setId("deleteurl");
    _jspx_th_s_url_4.setAction("delPatient");
    int _jspx_eval_s_url_4 = _jspx_th_s_url_4.doStartTag();
    if (_jspx_th_s_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_4);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_4);
    return false;
  }

  private boolean _jspx_meth_s_a_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_10 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_10.setPageContext(_jspx_page_context);
    _jspx_th_s_a_10.setParent(null);
    _jspx_th_s_a_10.setHref("%{deleteurl}");
    int _jspx_eval_s_a_10 = _jspx_th_s_a_10.doStartTag();
    if (_jspx_eval_s_a_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_10.doInitBody();
      }
      do {
        out.write("Delete Patient Details");
        int evalDoAfterBody = _jspx_th_s_a_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_10);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_10);
    return false;
  }

  private boolean _jspx_meth_s_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_5 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_5.setPageContext(_jspx_page_context);
    _jspx_th_s_url_5.setParent(null);
    _jspx_th_s_url_5.setId("modifyurl");
    _jspx_th_s_url_5.setAction("modPatient");
    int _jspx_eval_s_url_5 = _jspx_th_s_url_5.doStartTag();
    if (_jspx_th_s_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_5);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_5);
    return false;
  }

  private boolean _jspx_meth_s_a_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_11 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_11.setPageContext(_jspx_page_context);
    _jspx_th_s_a_11.setParent(null);
    _jspx_th_s_a_11.setHref("%{modifyurl}");
    int _jspx_eval_s_a_11 = _jspx_th_s_a_11.doStartTag();
    if (_jspx_eval_s_a_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_11.doInitBody();
      }
      do {
        out.write(" Edit Patient Details");
        int evalDoAfterBody = _jspx_th_s_a_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_11);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_11);
    return false;
  }

  private boolean _jspx_meth_s_a_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_12 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_12.setPageContext(_jspx_page_context);
    _jspx_th_s_a_12.setParent(null);
    _jspx_th_s_a_12.setHref("#");
    int _jspx_eval_s_a_12 = _jspx_th_s_a_12.doStartTag();
    if (_jspx_eval_s_a_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_12.doInitBody();
      }
      do {
        out.write("Departments");
        int evalDoAfterBody = _jspx_th_s_a_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_12);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_12);
    return false;
  }

  private boolean _jspx_meth_s_a_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_13 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_13.setPageContext(_jspx_page_context);
    _jspx_th_s_a_13.setParent(null);
    _jspx_th_s_a_13.setHref("department.jsp");
    int _jspx_eval_s_a_13 = _jspx_th_s_a_13.doStartTag();
    if (_jspx_eval_s_a_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_13.doInitBody();
      }
      do {
        out.write("Add Department Details");
        int evalDoAfterBody = _jspx_th_s_a_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_13);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_13);
    return false;
  }

  private boolean _jspx_meth_s_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_6 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_6.setPageContext(_jspx_page_context);
    _jspx_th_s_url_6.setParent(null);
    _jspx_th_s_url_6.setId("deleteurl");
    _jspx_th_s_url_6.setAction("deldepartment");
    int _jspx_eval_s_url_6 = _jspx_th_s_url_6.doStartTag();
    if (_jspx_th_s_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_6);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_6);
    return false;
  }

  private boolean _jspx_meth_s_a_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_14 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_14.setPageContext(_jspx_page_context);
    _jspx_th_s_a_14.setParent(null);
    _jspx_th_s_a_14.setHref("%{deleteurl}");
    int _jspx_eval_s_a_14 = _jspx_th_s_a_14.doStartTag();
    if (_jspx_eval_s_a_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_14.doInitBody();
      }
      do {
        out.write("Delete Department Details");
        int evalDoAfterBody = _jspx_th_s_a_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_14);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_14);
    return false;
  }

  private boolean _jspx_meth_s_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_7 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_7.setPageContext(_jspx_page_context);
    _jspx_th_s_url_7.setParent(null);
    _jspx_th_s_url_7.setId("modifyurl");
    _jspx_th_s_url_7.setAction("moddepartment");
    int _jspx_eval_s_url_7 = _jspx_th_s_url_7.doStartTag();
    if (_jspx_th_s_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_7);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_7);
    return false;
  }

  private boolean _jspx_meth_s_a_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_15 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_15.setPageContext(_jspx_page_context);
    _jspx_th_s_a_15.setParent(null);
    _jspx_th_s_a_15.setHref("%{modifyurl}");
    int _jspx_eval_s_a_15 = _jspx_th_s_a_15.doStartTag();
    if (_jspx_eval_s_a_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_15.doInitBody();
      }
      do {
        out.write(" Edit Department Details");
        int evalDoAfterBody = _jspx_th_s_a_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_15);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_15);
    return false;
  }

  private boolean _jspx_meth_s_a_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_16 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_16.setPageContext(_jspx_page_context);
    _jspx_th_s_a_16.setParent(null);
    _jspx_th_s_a_16.setHref("#");
    int _jspx_eval_s_a_16 = _jspx_th_s_a_16.doStartTag();
    if (_jspx_eval_s_a_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_16.doInitBody();
      }
      do {
        out.write("Medicines");
        int evalDoAfterBody = _jspx_th_s_a_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_16);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_16);
    return false;
  }

  private boolean _jspx_meth_s_a_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_17 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_17.setPageContext(_jspx_page_context);
    _jspx_th_s_a_17.setParent(null);
    _jspx_th_s_a_17.setHref("medicine_master.jsp");
    int _jspx_eval_s_a_17 = _jspx_th_s_a_17.doStartTag();
    if (_jspx_eval_s_a_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_17.doInitBody();
      }
      do {
        out.write("Add Medicine Details");
        int evalDoAfterBody = _jspx_th_s_a_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_17);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_17);
    return false;
  }

  private boolean _jspx_meth_s_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_8 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_8.setPageContext(_jspx_page_context);
    _jspx_th_s_url_8.setParent(null);
    _jspx_th_s_url_8.setId("deleteurl");
    _jspx_th_s_url_8.setAction("delMedicine");
    int _jspx_eval_s_url_8 = _jspx_th_s_url_8.doStartTag();
    if (_jspx_th_s_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_8);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_8);
    return false;
  }

  private boolean _jspx_meth_s_a_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_18 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_18.setPageContext(_jspx_page_context);
    _jspx_th_s_a_18.setParent(null);
    _jspx_th_s_a_18.setHref("%{deleteurl}");
    int _jspx_eval_s_a_18 = _jspx_th_s_a_18.doStartTag();
    if (_jspx_eval_s_a_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_18.doInitBody();
      }
      do {
        out.write("Delete Medicine Details");
        int evalDoAfterBody = _jspx_th_s_a_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_18);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_18);
    return false;
  }

  private boolean _jspx_meth_s_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_9 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_9.setPageContext(_jspx_page_context);
    _jspx_th_s_url_9.setParent(null);
    _jspx_th_s_url_9.setId("modifyurl");
    _jspx_th_s_url_9.setAction("modMedicine");
    int _jspx_eval_s_url_9 = _jspx_th_s_url_9.doStartTag();
    if (_jspx_th_s_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_9);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_9);
    return false;
  }

  private boolean _jspx_meth_s_a_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_19 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_19.setPageContext(_jspx_page_context);
    _jspx_th_s_a_19.setParent(null);
    _jspx_th_s_a_19.setHref("%{modifyurl}");
    int _jspx_eval_s_a_19 = _jspx_th_s_a_19.doStartTag();
    if (_jspx_eval_s_a_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_19.doInitBody();
      }
      do {
        out.write(" Edit Medicine Details");
        int evalDoAfterBody = _jspx_th_s_a_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_19);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_19);
    return false;
  }

  private boolean _jspx_meth_s_a_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_20 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_20.setPageContext(_jspx_page_context);
    _jspx_th_s_a_20.setParent(null);
    _jspx_th_s_a_20.setHref("#");
    int _jspx_eval_s_a_20 = _jspx_th_s_a_20.doStartTag();
    if (_jspx_eval_s_a_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_20.doInitBody();
      }
      do {
        out.write("Appointments");
        int evalDoAfterBody = _jspx_th_s_a_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_20);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_20);
    return false;
  }

  private boolean _jspx_meth_s_a_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_21 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_21.setPageContext(_jspx_page_context);
    _jspx_th_s_a_21.setParent(null);
    _jspx_th_s_a_21.setHref("appointment_master.jsp");
    int _jspx_eval_s_a_21 = _jspx_th_s_a_21.doStartTag();
    if (_jspx_eval_s_a_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_21.doInitBody();
      }
      do {
        out.write("Add Appointment Details");
        int evalDoAfterBody = _jspx_th_s_a_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_21);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_21);
    return false;
  }

  private boolean _jspx_meth_s_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_10 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_10.setPageContext(_jspx_page_context);
    _jspx_th_s_url_10.setParent(null);
    _jspx_th_s_url_10.setId("deleteurl");
    _jspx_th_s_url_10.setAction("delAppointment");
    int _jspx_eval_s_url_10 = _jspx_th_s_url_10.doStartTag();
    if (_jspx_th_s_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_10);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_10);
    return false;
  }

  private boolean _jspx_meth_s_a_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_22 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_22.setPageContext(_jspx_page_context);
    _jspx_th_s_a_22.setParent(null);
    _jspx_th_s_a_22.setHref("%{deleteurl}");
    int _jspx_eval_s_a_22 = _jspx_th_s_a_22.doStartTag();
    if (_jspx_eval_s_a_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_22.doInitBody();
      }
      do {
        out.write("Delete Appointment Details");
        int evalDoAfterBody = _jspx_th_s_a_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_22);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_22);
    return false;
  }

  private boolean _jspx_meth_s_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_11 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_11.setPageContext(_jspx_page_context);
    _jspx_th_s_url_11.setParent(null);
    _jspx_th_s_url_11.setId("modifyurl");
    _jspx_th_s_url_11.setAction("modAppointment");
    int _jspx_eval_s_url_11 = _jspx_th_s_url_11.doStartTag();
    if (_jspx_th_s_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_11);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_11);
    return false;
  }

  private boolean _jspx_meth_s_a_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_23 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_23.setPageContext(_jspx_page_context);
    _jspx_th_s_a_23.setParent(null);
    _jspx_th_s_a_23.setHref("%{modifyurl}");
    int _jspx_eval_s_a_23 = _jspx_th_s_a_23.doStartTag();
    if (_jspx_eval_s_a_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_23.doInitBody();
      }
      do {
        out.write(" Edit Appointment Details");
        int evalDoAfterBody = _jspx_th_s_a_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_23);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_23);
    return false;
  }

  private boolean _jspx_meth_s_a_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_24 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_24.setPageContext(_jspx_page_context);
    _jspx_th_s_a_24.setParent(null);
    _jspx_th_s_a_24.setHref("change_password.jsp");
    int _jspx_eval_s_a_24 = _jspx_th_s_a_24.doStartTag();
    if (_jspx_eval_s_a_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_24.doInitBody();
      }
      do {
        out.write("Change Password");
        int evalDoAfterBody = _jspx_th_s_a_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_24);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_24);
    return false;
  }

  private boolean _jspx_meth_s_a_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_25 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_25.setPageContext(_jspx_page_context);
    _jspx_th_s_a_25.setParent(null);
    _jspx_th_s_a_25.setHref("signout.jsp");
    int _jspx_eval_s_a_25 = _jspx_th_s_a_25.doStartTag();
    if (_jspx_eval_s_a_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_25.doInitBody();
      }
      do {
        out.write("Logout");
        int evalDoAfterBody = _jspx_th_s_a_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_25);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_25);
    return false;
  }
}
