<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_The Internet                          _49030b</name>
   <tag></tag>
   <elementGuidId>d66c65f8-4e47-47a6-91b6-0680218666c7</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>html.no-js</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//*/text()[normalize-space(.)='']/parent::*</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>html</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
      <webElementGuid>90abe755-8a26-4788-9fa9-81413618b7f9</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>no-js</value>
      <webElementGuid>252c15df-7ec3-483b-9d46-16b88c4d93a0</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
      <webElementGuid>0c9e3419-35a2-4f01-8a3b-ca94e9db258a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
    
    
    The Internet
    
    
    
    
    
    
    
      $(document).foundation();
    
  #katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon katalon-div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} katalon-div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} katalon-div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}
  
    
      
      
        
      
        
      
        
      
      
    
    
      
      
        
  Dropdown List
  
    Please select an option
    Option 1
    Option 2
  


  var dropdown = document.getElementById('dropdown');
  dropdown.onchange = function(event) {
    var options = dropdown.getElementsByTagName('option');
    for (var i = 0; i &lt; options.length; i++) {
      options[i].removeAttribute('selected');
    }
    document
      .querySelector(`#dropdown option[value='${event.target.value}']`)
      .setAttribute('selected', 'selected');
  };


      
    
    
      
        
        Powered by Elemental Selenium
      
    
  

/html[@class=&quot;no-js&quot;]</value>
      <webElementGuid>c4cc0aca-d8ba-433b-9989-df27e4d2f781</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;no-js&quot;]</value>
      <webElementGuid>67692d29-e946-4753-9a55-29563fb45d79</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)='']/parent::*</value>
      <webElementGuid>bbc9ab19-3b26-4c46-b780-761685a97256</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
      <webElementGuid>81574df2-2d8c-423f-b072-c1c572265377</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//html[(text() = concat(&quot;
    
    
    
    The Internet
    
    
    
    
    
    
    
      $(document).foundation();
    
  #katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon katalon-div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} katalon-div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} katalon-div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}
  
    
      
      
        
      
        
      
        
      
      
    
    
      
      
        
  Dropdown List
  
    Please select an option
    Option 1
    Option 2
  


  var dropdown = document.getElementById(&quot; , &quot;'&quot; , &quot;dropdown&quot; , &quot;'&quot; , &quot;);
  dropdown.onchange = function(event) {
    var options = dropdown.getElementsByTagName(&quot; , &quot;'&quot; , &quot;option&quot; , &quot;'&quot; , &quot;);
    for (var i = 0; i &lt; options.length; i++) {
      options[i].removeAttribute(&quot; , &quot;'&quot; , &quot;selected&quot; , &quot;'&quot; , &quot;);
    }
    document
      .querySelector(`#dropdown option[value=&quot; , &quot;'&quot; , &quot;${event.target.value}&quot; , &quot;'&quot; , &quot;]`)
      .setAttribute(&quot; , &quot;'&quot; , &quot;selected&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;selected&quot; , &quot;'&quot; , &quot;);
  };


      
    
    
      
        
        Powered by Elemental Selenium
      
    
  

/html[@class=&quot;no-js&quot;]&quot;) or . = concat(&quot;
    
    
    
    The Internet
    
    
    
    
    
    
    
      $(document).foundation();
    
  #katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon katalon-div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} katalon-div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} katalon-div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}
  
    
      
      
        
      
        
      
        
      
      
    
    
      
      
        
  Dropdown List
  
    Please select an option
    Option 1
    Option 2
  


  var dropdown = document.getElementById(&quot; , &quot;'&quot; , &quot;dropdown&quot; , &quot;'&quot; , &quot;);
  dropdown.onchange = function(event) {
    var options = dropdown.getElementsByTagName(&quot; , &quot;'&quot; , &quot;option&quot; , &quot;'&quot; , &quot;);
    for (var i = 0; i &lt; options.length; i++) {
      options[i].removeAttribute(&quot; , &quot;'&quot; , &quot;selected&quot; , &quot;'&quot; , &quot;);
    }
    document
      .querySelector(`#dropdown option[value=&quot; , &quot;'&quot; , &quot;${event.target.value}&quot; , &quot;'&quot; , &quot;]`)
      .setAttribute(&quot; , &quot;'&quot; , &quot;selected&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;selected&quot; , &quot;'&quot; , &quot;);
  };


      
    
    
      
        
        Powered by Elemental Selenium
      
    
  

/html[@class=&quot;no-js&quot;]&quot;))]</value>
      <webElementGuid>f23633ef-59a2-4a2f-99aa-e25e62a6dee0</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
