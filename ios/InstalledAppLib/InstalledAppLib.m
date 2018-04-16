//
//  RCTRongCloudIMLib.m
//  RCTRongCloudIMLib
//
//  Created by lovebing on 3/21/2016.
//  Copyright © 2016 lovebing.org. All rights reserved.
//

#import "InstalledAppLib.h"
#import <UIKit/UIKit.h>

@implementation InstalledAppLib
@synthesize bridge = _bridge;

RCT_EXPORT_MODULE(InstalledApp);

RCT_EXPORT_METHOD(isApplicationInstalled:(NSString *)name
                  resolver:(RCTPromiseResolveBlock)resolve
                  rejecter:(RCTPromiseRejectBlock)reject)
{
    BOOL b = [[UIApplication sharedApplication] canOpenURL:[NSURL URLWithString:name]];
    resolve([NSNumber numberWithBool:b]);
}
@end
