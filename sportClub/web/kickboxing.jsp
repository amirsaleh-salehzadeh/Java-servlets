<%@ page import="Obj.*" %>
<html>
<head>
<title>Register</title>
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
            <td width="648" align="center" style="color:white;" valign="top"><p><strong>Kickboxing</strong> is a <A title="Generic" href="http://en.wikipedia.org/wiki/Generic">generic</A> term for a <A title="Sport" href="http://en.wikipedia.org/wiki/Sport">sporting</A> <A title="Martial arts" href="http://en.wikipedia.org/wiki/Martial_arts">martial   art</A> that, while similar to <A title="Boxing" href="http://en.wikipedia.org/wiki/Boxing">boxing</A>, uses the feet as well as   the hands for <A title="Strike (attack)" href="http://en.wikipedia.org/wiki/Strike_%28attack%29">striking</A>. Kickboxing   can be practiced for general <A title="Physical fitness" href="http://en.wikipedia.org/wiki/Physical_fitness">fitness</A>, or as a <A title="Full-contact" href="http://en.wikipedia.org/wiki/Full-contact">full-contact</A> <A title="Combat sport" href="http://en.wikipedia.org/wiki/Combat_sport">combat   sport</A>. The male boxers are bare chested, bare foot and wear a boxershort.   The female boxers sometimes wear a <A title="Tank top" href="http://en.wikipedia.org/wiki/Tank_top">tank top</A> and shorts. Kickboxing   is sometimes practiced as an independent style however in many cases kickboxing   is just an event and set of rules of by which martial artists of other styles   may compete openly. Typically kickboxing in many competitions is a standing   fight sport and does not allow continuation of the fight once the fight has   reached the ground, however some styles may still train in this component for   example; sanshou especially in the military and police and so must be adapted   for kickboxing tournaments as well as many Japanese martial arts. Kickboxing can   be attributed to K series of fighting styles. There are different rules for   different kinds of kick-boxing.</p>
              <p>Forms of <em>kickboxing</em> that have been labelled under this term <A title="http://www.mikemiles.com/history1.html" href="http://www.mikemiles.com/history1.html">[1]</A> include:</p>
              <UL lastCheckbox="null">
                <LI><A title="Adithada" href="http://en.wikipedia.org/wiki/Adithada">Adithada</A> (Indian kickboxing) &mdash; A form of kickboxing that uses <A title="Knee (strike)" href="http://en.wikipedia.org/wiki/Knee_%28strike%29">knee</A>, <A title="Elbow (strike)" href="http://en.wikipedia.org/wiki/Elbow_%28strike%29">elbow</A> and <A title="Forehead" href="http://en.wikipedia.org/wiki/Forehead">forehead</A> strikes     
                <LI><A title="Pradal Serey" href="http://en.wikipedia.org/wiki/Pradal_Serey">Pradal Serey</A> (Khmer   kickboxing) &mdash; A possible predecessor of <A title="Muay Thai" href="http://en.wikipedia.org/wiki/Muay_Thai">Muay Thai</A>
                <LI><A title="Muay Thai" href="http://en.wikipedia.org/wiki/Muay_Thai">Muay   Thai</A> (Thai boxing) &mdash; Traditional Thai martial art of which has now grown   into a popular kickboxing event with strong emphasis on <A title="Knee (strike)" href="http://en.wikipedia.org/wiki/Knee_%28strike%29">knee</A> and <A title="Elbow (strike)" href="http://en.wikipedia.org/wiki/Elbow_%28strike%29">elbow strikes</A>
                <LI><A title="Savate" href="http://en.wikipedia.org/wiki/Savate">Savate</A> (French kickboxing) &mdash; Allows the use of shoes   
                <LI><A title="Sanshou" href="http://en.wikipedia.org/wiki/Sanshou">Sanshou</A>/<A title="Sanshou" href="http://en.wikipedia.org/wiki/Sanshou">Sanda</A> (Chinese   kickboxing) &mdash; The applicable component of wushu/kung fu of which <A title="Takedown (grappling)" href="http://en.wikipedia.org/wiki/Takedown_%28grappling%29">Takedowns</A> and <A title="Throw (grappling)" href="http://en.wikipedia.org/wiki/Throw_%28grappling%29">throws</A> are legal   in competition as well as all other sorts of striking (use of arms and legs).   
                <LI><A title="Lethwei" href="http://en.wikipedia.org/wiki/Lethwei">Lethwei</A> (Burmese Kickboxing) &mdash; Any part of the body may be used to <A title="Strike (attack)" href="http://en.wikipedia.org/wiki/Strike_%28attack%29">strike</A> and be struck     
                <LI>Japanese kickboxing &mdash; Similar to <A title="Muay Thai" href="http://en.wikipedia.org/wiki/Muay_Thai">Muay Thai</A>, but different point   system is taken   
                <LI><A title="Full contact karate" href="http://en.wikipedia.org/wiki/Full_contact_karate">Full Contact Karate</A> &mdash; Most of the time padding and in some cases body armor is used and is the   applicable component of karate like many other styles which also include   routines training. (also in some cases of traditional Thai boxing)   
                <LI><A title="Shoot boxing" href="http://en.wikipedia.org/wiki/Shoot_boxing">Shoot boxing</A> &mdash; A Japanese   form of kickboxing which allows <A title="Throw (grappling)" href="http://en.wikipedia.org/wiki/Throw_%28grappling%29">throwing</A> and <A title="Grappling hold" href="http://en.wikipedia.org/wiki/Grappling_hold#Submission_hold">submission</A> while standing similar to <A title="San Shou" href="http://en.wikipedia.org/wiki/San_Shou">San Shou</A>
                <LI>Yaw-Yan (Filipino Kickboxing) &mdash; Sayaw ng Kamatayan (Dance of Death) is the   proper name for Yaw-Yan, a Filipino martial art developed by Napoleon Fernandez.   The art resembles Muay Thai in a sense, but differs in the hip torquing motion   as well as downward-cutting of its kicks. </LI>
              </UL>
              <p>There are many additional derivatives of these forms, as well as combined   styles which have been used in specific competitions (e.g. <A title="K-1" href="http://en.wikipedia.org/wiki/K-1">K-1</A>). The rules of 'kickboxing' also   vary between these different styles.</p>
              <p>The term <em>kickboxing</em> is disputed and has come to become more associated   with the Japanese and American variants. It must be noted that many of the above   styles do not consider themselves to be 'kickboxing' as such, although the   public uses the term generically to refer to all these martial arts. The term   itself was created by the <A title="Japan" href="http://en.wikipedia.org/wiki/Japan">Japanese</A> boxing promoter <A title="Osamu Noguchi" href="http://en.wikipedia.org/wiki/Osamu_Noguchi">Osamu   Noguchi</A> for a variant of <A title="Muay Thai" href="http://en.wikipedia.org/wiki/Muay_Thai">Muay Thai</A> and <A title="Karate" href="http://en.wikipedia.org/wiki/Karate">Karate</A> that he created in the   1950s; this term was later used by the American variant. When used by the   practitioners of these two styles, it tends to refer to them specifically rather   than the martial arts they were derived from.</p>
              <DL>
                <DD><em>The rest of this article deals with the Japanese and American derivatives   of 'kickboxing'. For the other martial arts see their relevant articles.</em> </DD>
              </DL>            </td>
	</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>