<%@ page import="Obj.*" %>
<html>
<head>
<title>Home</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body bgcolor="#500000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- ImageReady Slices (theme.psd) -->
<table id="Table_01" width="800" border="0" cellpadding="0" align="center" cellspacing="0">
	<tr>
		<td colspan="2">
		<div style="position:absolute;" align="center">
                        <%
                       User u = (User)session.getAttribute("user");
                        if(u != null){%>
                            <a href="logOut" style="color:#fff;"> Logout</a>
                        <%   }
                        %>
                </div>
                 <img src="images/index_01.jpg" width="800" height="160" alt="" >
                             
                    
                </td>
	</tr>

	<tr>
		<td width="152" align="left" valign="top">
			<table align="left" vspace="0" cellpadding="0" cellspacing="0">
				<tr>
					<td>
                                             <a href="index.jsp" style="border:0px;"><img border="0" src="images/index_02.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>
				<tr>
					<td>
                                             <a href="Classes"><img border="0" src="images/index_04.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>
				<tr>
					<td>
                                             <a href="register.jsp"> <img border="0" src="images/index_05.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>								
				<tr>
					<td>
                                             <a href="kickboxing.jsp"> <img border="0" src="images/index_06.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>
			</table>
	  </td>
		<td width="648" align="left" valign="top">
			<table style="color:#FFCC00" align="left" vspace="0" cellpadding="0" cellspacing="0">
				<% if(request.getParameter("msg")!= null){%>
                                 
<tr>
					<td valign="top" align="center" style="color:#bbbb00; font-size:26px; font-weight:bold;">
                                                <%=request.getParameter("msg")%>
					</td>
              </tr>                                 
                                 <%}%>
                                 <tr>
					<td  valign="top">
						<form action="reg?goTo=logIn" method="post">
							Username:<input name="username" type="text">
							Password:<input name="password" type="password">
							<input type="submit" value="logIn">
						</form>
					</td>
              </tr><tr>
                                         <td>
                                            
                                            <h2><span style="color:white">History<o:p>
        </o:p>
        </span></h2>
        <p><span style="color:white">Kickboxing, as a derivative of <a href="http://en.wikipedia.org/wiki/Boxing" title="Boxing"><span style="color:
white;text-decoration:none;text-underline:none">Boxing</span></a>, <a href="http://en.wikipedia.org/wiki/Karate" title="Karate"><span style="color:
white;text-decoration:none;text-underline:none">Karate</span></a>, <a href="http://en.wikipedia.org/wiki/Muay_Thai" title="Muay Thai"><span style="color:white;text-decoration:none;text-underline:none">Muay
        Thai</span></a> as well as other styles, was created to compete
        effectively against these martial arts. The initial development of the
        styles (as well as the name) was in Japan. However, there were also
        similar influences taking hold in the United States in 1974 (<a href="http://en.wikipedia.org/wiki/Wako" title="Wako"><span style="color:white;text-decoration:none;text-underline:none">Wako</span></a>),
        and martial artists from many disciplines toured both areas allowing the
        development of a common kickboxing standard.<o:p>
        </o:p>
        </span></p>
        <h3><span style="color:white">Initial Japanese development<o:p>
        </o:p>
        </span></h3>
        <p><i><span style="color:white">Kickboxing</span></i><span style="color:white">
        (as a specific martial art) has its roots in <a href="http://en.wikipedia.org/wiki/Muay_Thai" title="Muay Thai"><span style="color:white;text-decoration:none;text-underline:none">Muay
        Thai</span></a>. It was developed as a competitive sport to oppose Muay
        Thai by <a href="http://en.wikipedia.org/wiki/Japan" title="Japan"><span style="color:white;
text-decoration:none;text-underline:none">Japanese</span></a> boxing promoter <a href="http://en.wikipedia.org/wiki/Osamu_Noguchi" title="Osamu Noguchi"><span style="color:white;text-decoration:none;text-underline:none">Osamu
        Noguchi</span></a>. He wanted to introduce Japan the <a href="http://en.wikipedia.org/wiki/Muay_Thai" title="Muay Thai"><span style="color:white;text-decoration:none;text-underline:none">Muay
        Thai</span></a> style of fighting that he had seen in <a href="http://en.wikipedia.org/wiki/Thailand" title="Thailand"><span style="color:white;text-decoration:none;text-underline:none">Thailand</span></a>.
        The 3 Muay Thai fighters were taken to Japan in 1966, and fought against
        3 karate fighters from <b>Oyama dojo</b> (<a href="http://en.wikipedia.org/wiki/Kyokushin" title="Kyokushin"><span style="color:white;text-decoration:none;text-underline:none">Kyokushin</span></a>
        later). Japan won by 2-1 then. Noguchi and <a href="http://en.wikipedia.org/w/index.php?title=Kenji_Kurosaki&amp;action=edit" title="Kenji Kurosaki"><span style="color:white;text-decoration:none;
text-underline:none">Kenji Kurosaki</span></a> (Kyokushin karate instructor)
        studied <a href="http://en.wikipedia.org/wiki/Muay_thai" title="Muay thai"><span style="color:white;text-decoration:none;text-underline:none">Muay
        thai</span></a> and developed a combined martial art which Noguchi named
        <i>kick boxing</i>. However, <a href="http://en.wikipedia.org/wiki/Throw_(grappling)" title="Throw (grappling)"><span style="color:white;text-decoration:none;
text-underline:none">throwing</span></a> and <a href="http://en.wikipedia.org/wiki/Headbutt" title="Headbutt"><span style="color:white;text-decoration:none;text-underline:none">butting</span></a>
        were allowed in the beginning to distinguish from Muay Thai style. This
        was repealed later. The Kickboxing Association was founded in Japan soon
        after this. Kickboxing boomed and became popular in Japan as it began to
        be broadcasted on <a href="http://en.wikipedia.org/wiki/Television" title="Television"><span style="color:white;text-decoration:none;text-underline:
none">TV</span></a>. <a href="http://en.wikipedia.org/wiki/Tadashi_Sawamura" title="Tadashi Sawamura"><span style="color:white;text-decoration:none;
text-underline:none">Tadashi Sawamura</span></a> was an especially popular early
        kickboxer. However, the boom was suddenly finished and became unpopular
        after Sawamura was retired. Kickboxing had not been on TV until K-1 was
        founded in 1993.<o:p>
        </o:p>
        </span></p>
        <p><span style="color:white">In 1993, as <a href="http://en.wikipedia.org/wiki/Kazuyoshi_Ishii" title="Kazuyoshi Ishii"><span style="color:white;text-decoration:none;text-underline:none">Kazuyoshi
        Ishii</span></a> (founder of <a href="http://en.wikipedia.org/w/index.php?title=Seidokan_karate&amp;action=edit" title="Seidokan karate"><span style="color:white;text-decoration:none;
text-underline:none">Seidokan karate</span></a>) produced <a href="http://en.wikipedia.org/wiki/K-1" title="K-1"><span style="color:white;
text-decoration:none;text-underline:none">K-1</span></a> under special
        kickboxing rules (No elbow and <a href="http://en.wikipedia.org/wiki/Grappling#Stand-up_grappling" title="Grappling"><span style="color:white;text-decoration:none;text-underline:
none">neck wrestling</span></a>) in 1993, kickboxing became famous again.<o:p>
        </o:p>
        </span></p>
        <p><span style="color:white">The sport has spread through <a href="http://en.wikipedia.org/wiki/North_America" title="North America"><span style="color:white;text-decoration:none;text-underline:none">North
        America</span></a>, <a href="http://en.wikipedia.org/wiki/Europe" title="Europe"><span style="color:white;text-decoration:none;text-underline:none">Europe</span></a>,
        and <a href="http://en.wikipedia.org/wiki/Australia" title="Australia"><span style="color:white;text-decoration:none;text-underline:none">Australia</span></a>.<o:p>
        </span>
        <p class="MsoNormal" style="margin-left:3.75pt"><span style="color:white">&nbsp;<o:p>
        </o:p>
        </span></p>
        <h3><span style="color:white">Spreading to Europe, Australia, and North
        America<o:p>
        </o:p>
        </span></h3>
        <p><i><span style="color:white">Jan Plas</span></i><span style="color:white">,
        the Dutch kickboxer founded <i>Mejiro jym</i> with some Muay Thai
        pioneers in <a href="http://en.wikipedia.org/wiki/Netherlands" title="Netherlands"><span style="color:white;text-decoration:none;text-underline:none">Netherlands</span></a>,
        1978 after he learned kickboxing from <i>Kenji Kurosaki</i> in Japan. In
        addition, he also founded NKBB (The Dutch Kickboxing Association) which
        is the first kickboxing organization in Netherlands in 1978. The sport
        took off in the U.S. with the popularity and success of <a href="http://en.wikipedia.org/wiki/Bill_Wallace_(martial_arts)" title="Bill Wallace (martial arts)"><span style="color:white;text-decoration:
none;text-underline:none">Bill &quot;Superfoot&quot; Wallace&quot;</span></a> in
        the 1970s.<o:p>
        </o:p>
        </span></p>
        <p><span style="color:white">As of 2006, the new world champion in
        American kickboxing is the Pennsylvanian Steve &quot;Slick Poon&quot;
        Parker.<o:p>
        </o:p>
        </span></p>
        <p class="MsoNormal" style="margin-left:3.75pt"><span style="color:white">&nbsp;<o:p>
        </o:p>
        </span></p>
        <h2><span style="color:white">Rules<o:p>
        </o:p>
        </span></h2>
        <p class="MsoNormal" style="margin-left:3.75pt"><span style="color:white">&nbsp;<o:p>
        </o:p>
        </span></p>
        <h3><span style="color:white">Japanese style kickboxing<o:p>
        </o:p>
        </span></h3>
        <p><span style="color:white">This is almost same as <a href="http://en.wikipedia.org/wiki/Muay_Thai" title="Muay Thai"><span style="color:white;text-decoration:none;text-underline:none">Muay
        Thai</span></a> but there are differences between them.<o:p>
        </o:p>
        </span></p>
        <ul type="disc">
          <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
     auto;mso-list:l1 level1 lfo1;tab-stops:list .5in">Similarities <o:p>
            </o:p>
          </li>
          <ul type="circle">
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in">time: three minutes ×
              five rounds <o:p>
              </o:p>
            </li>
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in">allowed to attack with <a href="http://en.wikipedia.org/wiki/Elbow" title="Elbow"><span style="color:white;text-decoration:none;text-underline:none">elbow</span></a>
              <o:p>
              </o:p>
            </li>
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in">allowed to attack with <a href="http://en.wikipedia.org/wiki/Knee" title="Knee"><span style="color:white;text-decoration:none;text-underline:none">knee</span></a>
              <o:p>
              </o:p>
            </li>
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in">allowed to kick the
              lower half of the body except <a href="http://en.wikipedia.org/wiki/Crotch" title="Crotch"><span style="color:white;text-decoration:none;text-underline:none">crotch</span></a>
              <o:p>
              </o:p>
            </li>
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in">allowed to do
              neck-wrestling (folding opponent's head with arms and elbows to
              attack the opponent's body or head with knee-strikes) <o:p>
              </o:p>
            </li>
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in"><a href="http://en.wikipedia.org/wiki/Head_butt" title="Head butt"><span style="color:white;text-decoration:none;text-underline:none">head
              butts</span></a> and throws were banned in 1966 for boxer safety <o:p>
              </o:p>
            </li>
          </ul>
        </ul>
        <ul type="disc">
          <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
     auto;mso-list:l0 level1 lfo2;tab-stops:list .5in">Differences <o:p>
            </o:p>
          </li>
          <ul type="circle">
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l0 level2 lfo2;tab-stops:list 1.0in">No ram muay before
              match <o:p>
              </o:p>
            </li>
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l0 level2 lfo2;tab-stops:list 1.0in">No Thai music at the
              match <o:p>
              </o:p>
            </li>
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l0 level2 lfo2;tab-stops:list 1.0in">Interval takes one
              minute only <o:p>
              </o:p>
            </li>
            <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
      auto;mso-list:l0 level2 lfo2;tab-stops:list 1.0in">Point system: <o:p>
              </o:p>
            </li>
          </ul>
        </ul>
        <p><span style="color:white">In muay thai, kicking to mid-body and head
        are judged highly. Moreover, kicking is still judged highly even if
        kicking was blocked. And punching is judged low. But they aren't in
        kickboxing.<o:p>
        </o:p>
        </span></p>
        <ul type="disc">
          <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
     auto;mso-list:l2 level1 lfo3;tab-stops:list .5in">See also <a href="http://en.wikipedia.org/wiki/K-1" title="K-1"><span style="color:white;
     text-decoration:none;text-underline:none">K-1</span></a> <o:p>
            </o:p>
          </li>
        </ul>
        <p class="MsoNormal" style="margin-left:3.75pt"><span style="color:white">&nbsp;<o:p>
        </o:p>
        </span></p>
        <h3><span style="color:white">American and Australian style kickboxing<o:p>
        </o:p>
        </span></h3>
        <p><span style="color:white">These are rules used in American and
        Australian Full Contact Karate. Opponents are allowed to hit each other
        with <a href="http://en.wikipedia.org/wiki/Fist" title="Fist"><span style="color:white;
text-decoration:none;text-underline:none">fists</span></a> and <a href="http://en.wikipedia.org/wiki/Foot" title="Foot"><span style="color:white;
text-decoration:none;text-underline:none">feet</span></a>, striking above the <a href="http://en.wikipedia.org/wiki/Hip" title="Hip"><span style="color:white;
text-decoration:none;text-underline:none">hip</span></a>. Using <a href="http://en.wikipedia.org/wiki/Elbow_(strike)" title="Elbow (strike)"><span style="color:white;text-decoration:none;text-underline:none">elbows</span></a>
        or <a href="http://en.wikipedia.org/wiki/Knee_(strike)" title="Knee (strike)"><span style="color:white;text-decoration:none;text-underline:
none">knees</span></a> is forbidden and the use of the <a href="http://en.wiktionary.org/wiki/shin" title="wiktionary:shin"><span style="color:white;text-decoration:none;text-underline:none">shins</span></a>
        is seldom allowed. This is in contrast to Muay Thai where the use of
        elbows and knees are allowed; in fact some Muay Thai practitioners
        consider kickboxing a &quot;watered down&quot; version of Muay Thai.
        Fighters and promoters can agree to various rules including kicks only
        above the waist, kicks anywhere, no knee strikes, knees only to the
        body, and so on.<o:p>
        </o:p>
        </span></p>
        <p><span style="color:white">Bouts are usually 3 to 12 rounds (lasting 2
        - 3 minutes each) for amateur and professional contests with a 1-minute
        rest in between rounds. The round durations and the number of rounds can
        vary depending on the stipulations agreed to before hand by each fighter
        or manager. A winner is declared during the bout if there is a <a href="http://en.wikipedia.org/wiki/Submission_(combat_sport_term)" title="Submission (combat sport term)"><span style="color:white;text-decoration:
none;text-underline:none">submission</span></a> (fighter quits or fighter's
        corner throws in the towel), <a href="http://en.wikipedia.org/wiki/Knockout" title="Knockout"><span style="color:white;text-decoration:none;text-underline:
none">knockout</span></a> (KO), or referee stoppage (<a href="http://en.wikipedia.org/wiki/Knockout" title="Knockout"><span style="color:white;text-decoration:none;text-underline:none">Technical
        Knock Out</span></a>, or TKO). If all of the rounds expire with no
        knockout then the fight is scored by a team of 3 judges. The judges
        determine a winner based on their scoring of each round. A split
        decision indicates a disagreement between the judges, while a unanimous
        decision indicates that all judges saw the fight the same way and all
        have declared the same winner.<o:p>
        </o:p>
        </span></p>
        <p class="MsoNormal" style="margin-left:3.75pt"><span style="color:white">&nbsp;<o:p>
        </o:p>
        </span></p>
        <h3><span style="color:white">European style kickboxing<o:p>
        </o:p>
        </span></h3>
        <p><span style="color:white">Originally, American style kickboxing was
        formed with <a href="http://en.wikipedia.org/wiki/Muay_thai" title="Muay thai"><span style="color:white;text-decoration:none;text-underline:none">Muay
        thai</span></a> and Japanese kickboxing.<o:p>
        </o:p>
        </span></p>
        <ul type="disc">
          <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in">time: 3 minutes × 5
            rounds <o:p>
            </o:p>
          </li>
          <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in">not allowed to attack to
            with <a href="http://en.wikipedia.org/wiki/Elbow" title="Elbow"><span style="color:white;text-decoration:none;text-underline:none">elbow</span></a>
            <o:p>
            </o:p>
          </li>
          <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in">allowed to attack with <a href="http://en.wikipedia.org/wiki/Knee" title="Knee"><span style="color:white;text-decoration:none;text-underline:none">knee</span></a>
            <o:p>
            </o:p>
          </li>
          <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in">allowed to kick the lower
            half of the body except <a href="http://en.wikipedia.org/wiki/Crotch" title="Crotch"><span style="color:white;text-decoration:none;text-underline:
     none">crotch</span></a> <o:p>
            </o:p>
          </li>
          <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in">allowed to do
            neck-wrestling but frequency is limited. <o:p>
            </o:p>
          </li>
          <li class="MsoNormal" style="color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:
     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in">headbutts and throws are
            not allowed <o:p>
            </o:p>
          </li>
        </ul>
        <p class="MsoNormal"><span style="color:white">&nbsp;<o:p>
        </span></p> 
                                         </td>
				</tr>
			</table>
		
	  </td>
	</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>