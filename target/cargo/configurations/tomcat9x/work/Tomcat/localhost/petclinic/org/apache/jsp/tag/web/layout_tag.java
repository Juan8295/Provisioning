/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2022-04-11 14:57:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layout_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(11);
    _jspx_dependants.put("jar:file:/home/juan/provisioningnew/Provisioning/target/cargo/configurations/tomcat9x/webapps/petclinic/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425975070000L));
    _jspx_dependants.put("/WEB-INF/tags/footer.tag", Long.valueOf(1649689021730L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1649689021806L));
    _jspx_dependants.put("jar:file:/home/juan/provisioningnew/Provisioning/target/cargo/configurations/tomcat9x/webapps/petclinic/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425975070000L));
    _jspx_dependants.put("/WEB-INF/tags/htmlHeader.tag", Long.valueOf(1649689021730L));
    _jspx_dependants.put("jar:file:/home/juan/provisioningnew/Provisioning/target/cargo/configurations/tomcat9x/webapps/petclinic/WEB-INF/lib/spring-webmvc-5.3.8.jar!/META-INF/spring.tld", Long.valueOf(1623217188000L));
    _jspx_dependants.put("/WEB-INF/tags/bodyHeader.tag", Long.valueOf(1649689021730L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.3.8.jar", Long.valueOf(1649689021834L));
    _jspx_dependants.put("/WEB-INF/tags/menuItem.tag", Long.valueOf(1649689021730L));
    _jspx_dependants.put("/WEB-INF/tags/pivotal.tag", Long.valueOf(1649689021730L));
    _jspx_dependants.put("/WEB-INF/tags/menu.tag", Long.valueOf(1649689021730L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String pageName;
  private javax.servlet.jsp.tagext.JspFragment customScript;

  public java.lang.String getPageName() {
    return this.pageName;
  }

  public void setPageName(java.lang.String pageName) {
    this.pageName = pageName;
    jspContext.setAttribute("pageName", pageName);
  }

  public javax.servlet.jsp.tagext.JspFragment getCustomScript() {
    return this.customScript;
  }

  public void setCustomScript(javax.servlet.jsp.tagext.JspFragment customScript) {
    this.customScript = customScript;
    jspContext.setAttribute("customScript", customScript);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getPageName() != null ) 
      _jspx_page_context.setAttribute("pageName", getPageName());
    if( getCustomScript() != null ) 
      _jspx_page_context.setAttribute("customScript", getCustomScript());

    try {
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      if (_jspx_meth_petclinic_005fhtmlHeader_005f0(_jspx_page_context))
        return;
      out.write("<body>\n");
      if (_jspx_meth_petclinic_005fbodyHeader_005f0(_jspx_page_context))
        return;
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"container xd-container\">\n");
      out.write("\n");
      out.write("        ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,getJspContext());
      if (_jspx_meth_petclinic_005fpivotal_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</div>\n");
      if (_jspx_meth_petclinic_005ffooter_005f0(_jspx_page_context))
        return;
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getCustomScript() != null) {
        getCustomScript().invoke(_jspx_sout);
      }
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }

  private boolean _jspx_meth_petclinic_005fhtmlHeader_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  petclinic:htmlHeader
    org.apache.jsp.tag.web.htmlHeader_tag _jspx_th_petclinic_005fhtmlHeader_005f0 = new org.apache.jsp.tag.web.htmlHeader_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_petclinic_005fhtmlHeader_005f0);
    try {
      _jspx_th_petclinic_005fhtmlHeader_005f0.setJspContext(_jspx_page_context);
      _jspx_th_petclinic_005fhtmlHeader_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      _jspx_th_petclinic_005fhtmlHeader_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_petclinic_005fhtmlHeader_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_petclinic_005fbodyHeader_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  petclinic:bodyHeader
    org.apache.jsp.tag.web.bodyHeader_tag _jspx_th_petclinic_005fbodyHeader_005f0 = new org.apache.jsp.tag.web.bodyHeader_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_petclinic_005fbodyHeader_005f0);
    try {
      _jspx_th_petclinic_005fbodyHeader_005f0.setJspContext(_jspx_page_context);
      _jspx_th_petclinic_005fbodyHeader_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/layout.tag(12,0) name = menuName type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_petclinic_005fbodyHeader_005f0.setMenuName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageName}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      _jspx_th_petclinic_005fbodyHeader_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_petclinic_005fbodyHeader_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_petclinic_005fpivotal_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  petclinic:pivotal
    org.apache.jsp.tag.web.pivotal_tag _jspx_th_petclinic_005fpivotal_005f0 = new org.apache.jsp.tag.web.pivotal_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_petclinic_005fpivotal_005f0);
    try {
      _jspx_th_petclinic_005fpivotal_005f0.setJspContext(_jspx_page_context);
      _jspx_th_petclinic_005fpivotal_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      _jspx_th_petclinic_005fpivotal_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_petclinic_005fpivotal_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_petclinic_005ffooter_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  petclinic:footer
    org.apache.jsp.tag.web.footer_tag _jspx_th_petclinic_005ffooter_005f0 = new org.apache.jsp.tag.web.footer_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_petclinic_005ffooter_005f0);
    try {
      _jspx_th_petclinic_005ffooter_005f0.setJspContext(_jspx_page_context);
      _jspx_th_petclinic_005ffooter_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      _jspx_th_petclinic_005ffooter_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_petclinic_005ffooter_005f0);
    }
    return false;
  }
}
