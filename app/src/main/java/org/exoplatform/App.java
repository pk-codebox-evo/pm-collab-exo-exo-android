package org.exoplatform;

/*
 * Copyright (C) 2003-2016 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 *
 */

import android.app.Application;

/**
 * Created by chautn on 10/26/15. Exo Application instance and constants.
 */
public class App extends Application {

  public static final String TRIBE_URL      = "https://community.exoplatform.com";

  public static final long   DELAY_1H_NANOS = 3600000000000L;

  public static class Preferences {

    public static final String FILE_NAME       = "eXoPreferences";

    public static final String LAST_VISIT_TIME = "LAST_VISIT_TIME";

    public static final String SERVERS_STORAGE = "SERVERS_STORAGE";
  }

  public static class Platform {

    public static final String DOCUMENT_PERSONAL_DRIVE_NAME = "Personal Documents";

    public static final String DOCUMENT_JCR_PATH            = "/rest/private/jcr";

    public static final String DOCUMENT_UPLOAD_PATH_REST    = "/rest/managedocument/uploadFile/upload";

    public static final String DOCUMENT_CONTROL_PATH_REST   = "/rest/managedocument/uploadFile/control";

    public static final Double MIN_SUPPORTED_VERSION        = 4.3;
  }

  public static class Share {

    public static final int MAX_ITEMS_ALLOWED    = 10;

    public static final int DOCUMENT_MAX_SIZE_MB = 10;
  }

  public static class Permissions {
    public static final int REQUEST_PICK_IMAGE_FROM_GALLERY = 8;
  }
}