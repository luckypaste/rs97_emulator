/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.28
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package sdljava.x.swig;

public class SDL_PixelFormat {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_PixelFormat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_PixelFormat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      SWIG_SDLVideoJNI.delete_SDL_PixelFormat(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setPalette(SDL_Palette value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_palette_set(swigCPtr, SDL_Palette.getCPtr(value));
  }

  public SDL_Palette getPalette() {
    long cPtr = SWIG_SDLVideoJNI.SDL_PixelFormat_palette_get(swigCPtr);
    return (cPtr == 0) ? null : new SDL_Palette(cPtr, false);
  }

  public void setBitsPerPixel(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_BitsPerPixel_set(swigCPtr, value);
  }

  public short getBitsPerPixel() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_BitsPerPixel_get(swigCPtr);
  }

  public void setBytesPerPixel(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_BytesPerPixel_set(swigCPtr, value);
  }

  public short getBytesPerPixel() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_BytesPerPixel_get(swigCPtr);
  }

  public void setRloss(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Rloss_set(swigCPtr, value);
  }

  public short getRloss() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Rloss_get(swigCPtr);
  }

  public void setGloss(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Gloss_set(swigCPtr, value);
  }

  public short getGloss() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Gloss_get(swigCPtr);
  }

  public void setBloss(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Bloss_set(swigCPtr, value);
  }

  public short getBloss() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Bloss_get(swigCPtr);
  }

  public void setAloss(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Aloss_set(swigCPtr, value);
  }

  public short getAloss() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Aloss_get(swigCPtr);
  }

  public void setRshift(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Rshift_set(swigCPtr, value);
  }

  public short getRshift() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Rshift_get(swigCPtr);
  }

  public void setGshift(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Gshift_set(swigCPtr, value);
  }

  public short getGshift() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Gshift_get(swigCPtr);
  }

  public void setBshift(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Bshift_set(swigCPtr, value);
  }

  public short getBshift() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Bshift_get(swigCPtr);
  }

  public void setAshift(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Ashift_set(swigCPtr, value);
  }

  public short getAshift() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Ashift_get(swigCPtr);
  }

  public void setRmask(long value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Rmask_set(swigCPtr, value);
  }

  public long getRmask() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Rmask_get(swigCPtr);
  }

  public void setGmask(long value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Gmask_set(swigCPtr, value);
  }

  public long getGmask() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Gmask_get(swigCPtr);
  }

  public void setBmask(long value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Bmask_set(swigCPtr, value);
  }

  public long getBmask() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Bmask_get(swigCPtr);
  }

  public void setAmask(long value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_Amask_set(swigCPtr, value);
  }

  public long getAmask() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_Amask_get(swigCPtr);
  }

  public void setColorkey(long value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_colorkey_set(swigCPtr, value);
  }

  public long getColorkey() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_colorkey_get(swigCPtr);
  }

  public void setAlpha(short value) {
    SWIG_SDLVideoJNI.SDL_PixelFormat_alpha_set(swigCPtr, value);
  }

  public short getAlpha() {
    return SWIG_SDLVideoJNI.SDL_PixelFormat_alpha_get(swigCPtr);
  }

  public SDL_PixelFormat() {
    this(SWIG_SDLVideoJNI.new_SDL_PixelFormat(), true);
  }

}