import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.CvType;
import org.opencv.core.Scalar;


public class main {
    public static void main(String[] args) throws FrameGrabber.Exception {
        OpenCVFrameGrabber CVGrab = new OpenCVFrameGrabber(0);
        CVGrab.start();
        Frame frame = CVGrab.grab();
        CanvasFrame  CF = new CanvasFrame("");
        CF.setCanvasSize(frame.imageWidth,frame.imageHeight);
        while (CF.isVisible()&&(frame = CVGrab.grab())!=null){
            CF.showImage(frame);
        }
    }
}
