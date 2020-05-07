package model

class Camera {

    private var isOn: Boolean = false
    private var resolution: Int = 640

    public fun setCameraStatus(onOff: Boolean){
        this.isOn = onOff
    }

    public fun getCameraStatus(): String{
        val message = if (isOn){
            "Camera is Turned";
        }else{
            "Camera is not turned";
        }
        return message;
    }

    public fun setResolution(resolution: Int){
        this.resolution = resolution;
    }

    public fun getResolution():Int{
        return this.resolution;
    }



    /*public fun setCameraStatus(onOff: Boolean){
        this.isOn = onOff
    }*/
}