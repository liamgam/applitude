// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Placeholder.h"

@interface PlaceholderResolver : NSObject<Placeholder> {

	NSArray *fArray;

}

- (id) initWithArray:(NSArray *)array;

@end
