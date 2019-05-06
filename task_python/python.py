import psutil as p

while True:
    metric = input("Please write one of the commands: cpu or mem or exit\n");

    def check_attr_vm(obj,param):
        if(hasattr(obj,param)):
            return getattr(obj, param)
        else:
           return "0.0"

    if(metric == "cpu"):
        obj = p.cpu_times();
        print("system.cpu.idle",check_attr_vm(obj,"idle"),"\n"
              "system.cpu.user",check_attr_vm(obj,"user"),"\n"
              "system.cpu.guest",check_attr_vm(obj,"guest"),"\n"
              "system.cpu.iowait",check_attr_vm(obj,"iowait"),"\n"
              "system.cpu.stolen",check_attr_vm(obj,"stolen"),"\n"
              "system.cpu.system",check_attr_vm(obj,"system"),"\n")
    elif(metric == "mem"):
        obj = p.virtual_memory()   
        print("virtual total",check_attr_vm(obj,"total"),"\n"
              "virtual used",check_attr_vm(obj,"used"),"\n"
              "virtual free",check_attr_vm(obj,"free"),"\n"
              "virtual shared",check_attr_vm(obj,"shared "))
        obj = p.swap_memory()
        print("swap total",check_attr_vm(obj,"total"),"\n"
              "swap used",check_attr_vm(obj,"used"),"\n"
              "swap free",check_attr_vm(obj,"free"),"\n")
    elif(metric == "exit"):
        break
