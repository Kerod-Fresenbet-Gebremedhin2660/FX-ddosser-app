// $Id: CapturePacketException.java,v 1.1 2001/05/17 20:13:51 pcharles Exp $

/***************************************************************************
 * Copyright (C) 2001, Patrick Charles and Jonas Lehmann                   *
 * Distributed under the Mozilla Public License                            *
 *   http://www.mozilla.org/NPL/MPL-1.1.txt                                *
 ***************************************************************************/
package JPCAP.capture;


/**
 * This exception occurs when an error occurs while capturing data.
 *
 * @author Patrick Charles and Jonas Lehmann
 * @version $Revision: 1.1 $
 * @lastModifiedBy $Author: pcharles $
 * @lastModifiedAt $Date: 2001/05/17 20:13:51 $
 */
public class CapturePacketException extends Exception
{
  /**
   * Create a new invalid capture device exception.
   */
  public CapturePacketException(String message) { 
    super(message);
  }


  private static String _rcsId = 
    "$Id: CapturePacketException.java,v 1.1 2001/05/17 20:13:51 pcharles Exp $";
}
