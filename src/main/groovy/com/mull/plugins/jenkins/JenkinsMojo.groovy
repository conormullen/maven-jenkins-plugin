/**
 * 
 */
package com.mull.plugins.jenkins

import javax.management.modelmbean.RequiredModelMBean;

import org.jfrog.maven.annomojo.annotations.MojoGoal;
import org.jfrog.maven.annomojo.annotations.MojoParameter;
import org.jfrog.maven.annomojo.annotations.MojoPhase;

/**
 * This class is used to describe the defaul Mojo for the Jenkins plugin.
 * 
 * @author conormullen
 *
 */
@MojoGoal( 'generate' )
@MojoPhase( 'compile' )
class JenkinsMojo {
	
	@MojoParameter( required=true)
	public String jenkinsUrl;

}
