

interface OptimizableModel {

    void quantize();
}

class ResNet18 implements OptimizableModel {

    public void quantize() {
        System.out.println("Applying int8 quantization for ResNet-18.");
    }
}

class MobileNet implements OptimizableModel {

    public void quantize() {
        System.out.println("Applyong dynamic quantization for MoblieNet");
    }
}

class InferenceEngine {

    public void optimize(OptimizableModel model) {
        model.quantize();
    }
}

public class Main4 {

    public static void main(String[] args) {
        InferenceEngine engine = new InferenceEngine();
        engine.optimize(new ResNet18());
        engine.optimize(new MobileNet());
    }
}
