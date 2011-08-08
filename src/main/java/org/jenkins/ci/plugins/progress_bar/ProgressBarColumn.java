/*
 * The MIT License
 * 
 * Copyright (c) 2011, Jesse Farinacci
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.jenkins.ci.plugins.progress_bar;

import hudson.Extension;
import hudson.views.ListViewColumnDescriptor;
import hudson.views.ListViewColumn;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * A {@link ListViewColumn} which adds the standard build progress bar.
 * 
 * @author <a href="mailto:jieryn@gmail.com">Jesse Farinacci</a>
 * @since 1.0
 */
public final class ProgressBarColumn extends ListViewColumn {
	@Extension
	public static class DescriptorImpl extends ListViewColumnDescriptor {
		@Override
		public String getDisplayName() {
			return Messages.Progress_Bar_Plugin_DisplayName();
		}
	}

	@DataBoundConstructor
	public ProgressBarColumn() {
		super();
	}
}
